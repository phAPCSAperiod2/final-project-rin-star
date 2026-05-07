import java.util.ArrayList;

/**
 * Manages members, meetings, and attendance tracking for the club.
 * Uses both ArrayLists and a 2D array for structured attendance storage.
 */
public class Club {

    /** List of all club members */
    private ArrayList<Member> members;

    /** List of all meetings */
    private ArrayList<AttendanceRecord> meetings;

    /** 2D array tracking attendance (member x meeting) */
    private boolean[][] attendanceGrid;

    /**
     * Constructs a Club with empty members, meetings, and attendance grid.
     */
    public Club() {
        members = new ArrayList<Member>();
        meetings = new ArrayList<AttendanceRecord>();
        attendanceGrid = new boolean[50][50];
    }

    /**
     * Adds a member if they do not already exist.
     *
     * @param name name of member
     */
    public void addMember(String name) {
        for (Member m : members) {
            if (m.getName().equalsIgnoreCase(name)) {
                System.out.println("Member already exists.");
                return;
            }
        }
        members.add(new Member(name));
    }

    /**
     * Adds a new meeting.
     *
     * @param date meeting date
     */
    public void addMeeting(String date) {
        meetings.add(new AttendanceRecord(date));
    }

    /**
     * Returns list of members.
     *
     * @return ArrayList of members
     */
    public ArrayList<Member> getMembers() {
        return members;
    }

    /**
     * Returns list of meetings.
     *
     * @return ArrayList of meetings
     */
    public ArrayList<AttendanceRecord> getMeetings() {
        return meetings;
    }

    /**
     * Marks attendance in both the object system and 2D array.
     *
     * @param memberIndex index of member
     * @param meetingIndex index of meeting
     */
    public void markAttendance(int memberIndex, int meetingIndex) {
        Member m = members.get(memberIndex);
        meetings.get(meetingIndex).markPresent(m);
        attendanceGrid[memberIndex][meetingIndex] = true;
    }

    /**
     * Updates 2D array directly (used in editing).
     */
    public void setAttendance(int memberIndex, int meetingIndex, boolean value) {
        attendanceGrid[memberIndex][meetingIndex] = value;
    }

    /**
     * Checks attendance from 2D array.
     *
     * @return true if present, false otherwise
     */
    public boolean wasPresent(int memberIndex, int meetingIndex) {
        return attendanceGrid[memberIndex][meetingIndex];
    }

    /**
     * Displays attendance statistics using 2D array.
     */
    public void displayStats() {
        System.out.println("Attendance Stats:");

        for (int i = 0; i < members.size(); i++) {
            int attended = 0;

            for (int j = 0; j < meetings.size(); j++) {
                if (attendanceGrid[i][j]) {
                    attended++;
                }
            }

            int missed = meetings.size() - attended;

            System.out.println(members.get(i).getName()
                + " | Attended: " + attended
                + " | Missed: " + missed);
        }
    }

    /**
     * Displays all meetings.
     */
    public void displayMeetings() {
        for (int i = 0; i < meetings.size(); i++) {
            System.out.println((i + 1) + ". " + meetings.get(i).getDate());
        }
    }

    /**
     * Displays all members.
     */
    public void displayMembers() {
        for (int i = 0; i < members.size(); i++) {
            System.out.println((i + 1) + ". " + members.get(i).getName());
        }
    }
}
