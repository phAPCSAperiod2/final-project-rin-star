import java.util.Scanner;

/**
 * Main class for the Club Attendance Tracker program.
 * Handles user interaction through a menu system and connects all classes.
 */
public class Main {

    /**
     * Runs the program and displays the menu for user interaction.
     * Allows users to add members, record attendance, view stats, and edit records.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Club club = new Club();

        int choice = 0;

        while (choice != 5) {
            System.out.println("Club Attendance Tracker");
            System.out.println("1. Add Member");
            System.out.println("2. Record Meeting Attendance");
            System.out.println("3. View Stats");
            System.out.println("4. Edit Attendance Record");
            System.out.println("5. Exit");
            System.out.print("Choice: ");
            choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                /**
                 * Adds a new member to the club.
                 */
                System.out.print("Enter member name: ");
                String name = input.nextLine();
                club.addMember(name);
            }

            else if (choice == 2) {
                /**
                 * Creates a new meeting and records attendance for all members.
                 */
                System.out.print("Enter meeting date: ");
                String date = input.nextLine();
                club.addMeeting(date);

                AttendanceRecord meeting =
                    club.getMeetings().get(club.getMeetings().size() - 1);

                for (int i = 0; i < club.getMembers().size(); i++) {
                    System.out.print("Was " +
                        club.getMembers().get(i).getName() +
                        " present? (y/n): ");
                    String answer = input.nextLine();

                    if (answer.equalsIgnoreCase("y")) {
                        meeting.markPresent(club.getMembers().get(i));
                    }
                }
            }

            else if (choice == 3) {
                /**
                 * Displays attendance statistics for all members.
                 */
                club.displayStats();
            }

            else if (choice == 4) {
                /**
                 * Allows user to edit a previous attendance record.
                 * Removes a member from a selected meeting.
                 */
                club.displayMeetings();
                System.out.print("Choose meeting number: ");
                int meetNum = input.nextInt();
                input.nextLine();

                AttendanceRecord meeting =
                    club.getMeetings().get(meetNum - 1);

                meeting.displayAttendance();

                System.out.print("Enter member name to remove: ");
                String removeName = input.nextLine();

                for (int i = 0; i < club.getMembers().size(); i++) {
                    if (club.getMembers().get(i).getName()
                        .equalsIgnoreCase(removeName)) {

                        meeting.removeMember(club.getMembers().get(i));
                    }
                }
            }
        }

        input.close();
    }
}
