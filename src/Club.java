import java.util.ArrayList;

/**
 * The Club class manages all members and attendance records.
 * It stores members, creates meetings, and displays stats.
 */
public class Club {
    private ArrayList<Member> members;
    private ArrayList<AttendanceRecord> meetings;

    /**
     * Constructs a new Club with empty member and meeting lists.
     */
    public Club() {
        members = new ArrayList<Member>();
        meetings = new ArrayList<AttendanceRecord>();
    }

    /**
     * Adds a new member to the club.
     *
     * @param name the name of the member to add
     */
    public void addMember(String name) {
        members.add(new Member(name));
    }

    /**
     * Returns the list of members in the club.
     *
     * @return ArrayList of Member objects
     */
    public ArrayList<Member> getMembers() {
        return members;
    }

    /**
     * Returns the list of attendance records (meetings).
     *
     * @return ArrayList of AttendanceRecord objects
     */
    public ArrayList<AttendanceRecord> getMeetings() {
        return meetings;
    }

    /**
     * Creates and adds a new meeting with the given date.
     *
     * @param date the date of the meeting
     */
    public void addMeeting(String date) {
        meetings.add(new AttendanceRecord(date));
    }

    /**
     * Displays all members in the club with numbering.
     */
    public void displayMembers() {
        for (int i = 0; i < members.size(); i++) {
            System.out.println((i + 1) + ". " + members.get(i).getName());
        }
    }

    /**
     * Displays attendance statistics for all members.
     */
    public void displayStats() {
        System.out.println("Attendance Stats:");
        for (int i = 0; i < members.size(); i++) {
            System.out.println(members.get(i));
        }
    }

    /**
     * Displays all meetings with their dates.
     */
    public void displayMeetings() {
        for (int i = 0; i < meetings.size(); i++) {
            System.out.println((i + 1) + ". " + meetings.get(i).getDate());
        }
    }
}
