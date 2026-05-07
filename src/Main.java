import java.util.Scanner;

/**
 * Runs the menu system for the Club Attendance Tracker application.
 * Handles all user interaction and connects the Club system together.
 */
public class Main {

    /**
     * Entry point of the program.
     * Provides a menu for adding members, meetings, editing attendance,
     * and viewing statistics.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Club club = new Club();

        int choice = 0;

        while (choice != 5) {
            System.out.println("\n=== Club Attendance Tracker ===");
            System.out.println("1. Add Member");
            System.out.println("2. Add Meeting + Record Attendance");
            System.out.println("3. View Stats");
            System.out.println("4. Edit Attendance");
            System.out.println("5. Exit");
            System.out.print("Choice: ");

            if (input.hasNextInt()) {
                choice = input.nextInt();
            } else {
                System.out.println("Invalid input.");
                input.nextLine();
                continue;
            }
            input.nextLine();

            if (choice == 1) {
                System.out.print("Enter name: ");
                club.addMember(input.nextLine());
            }

            else if (choice == 2) {
                System.out.print("Enter meeting date: ");
                String date = input.nextLine();
                club.addMeeting(date);

                int meetingIndex = club.getMeetings().size() - 1;

                for (int i = 0; i < club.getMembers().size(); i++) {
                    System.out.print("Was " +
                        club.getMembers().get(i).getName() +
                        " present? (y/n): ");

                    String ans = input.nextLine();

                    if (ans.equalsIgnoreCase("y")) {
                        club.markAttendance(i, meetingIndex);
                    }
                }
            }

            else if (choice == 3) {
                club.displayStats();
            }

            else if (choice == 4) {

                club.displayMeetings();

                System.out.print("Choose meeting #: ");
                int meetNum = input.nextInt() - 1;
                input.nextLine();

                if (meetNum >= 0 && meetNum < club.getMeetings().size()) {

                    AttendanceRecord meeting =
                        club.getMeetings().get(meetNum);

                    System.out.println("\nEditing Attendance for "
                        + meeting.getDate());

                    for (int i = 0; i < club.getMembers().size(); i++) {

                        Member currentMember = club.getMembers().get(i);

                        boolean present =
                            club.wasPresent(i, meetNum);

                        System.out.print(currentMember.getName()
                            + " currently "
                            + (present ? "Present" : "Absent")
                            + ". Change attendance? (y/n): ");

                        String change = input.nextLine();

                        if (change.equalsIgnoreCase("y")) {

                            if (present) {
                                meeting.removeMember(currentMember);
                                club.setAttendance(i, meetNum, false);
                                System.out.println("Marked absent.");
                            } else {
                                meeting.markPresent(currentMember);
                                club.setAttendance(i, meetNum, true);
                                System.out.println("Marked present.");
                            }
                        }
                    }
                } else {
                    System.out.println("Invalid meeting number.");
                }
            }
        }

        input.close();
    }
}
