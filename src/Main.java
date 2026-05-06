import java.util.Scanner;

/**
 * Runs the menu system for the Club Attendance Tracker.
 */
public class Main {

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

                    meeting.displayAttendance();

                    System.out.print("Enter name to remove: ");
                    String name = input.nextLine();

                    for (int i = 0; i < club.getMembers().size(); i++) {
                        if (club.getMembers().get(i).getName()
                            .equalsIgnoreCase(name)) {

                            meeting.removeMember(club.getMembers().get(i));
                        }
                    }
                }
            }
        }

        input.close();
    }
}
