import java.util.ArrayList;

/**
 * Manages members and meetings for the club.
 */
public class Club {
    private ArrayList<Member> members;
    private ArrayList<AttendanceRecord> meetings;

    // ⭐ 2D ARRAY REQUIREMENT
    private boolean[][] attendanceGrid;

    public Club() {
        members = new ArrayList<Member>();
        meetings = new ArrayList<AttendanceRecord>();
        attendanceGrid = new boolean[50][50]; // supports up to 50 members & 50 meetings
    }

    public void addMember(String name) {
        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).getName().equalsIgnoreCase(name)) {
                System.out.println("Member already exists.");
                return;
            }
        }
        members.add(new Member(name));
    }

    public void addMeeting(String date) {
        meetings.add(new AttendanceRecord(date));
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public ArrayList<AttendanceRecord> getMeetings() {
        return meetings;
    }

    // mark attendance + update 2D array
    public void markAttendance(int memberIndex, int meetingIndex) {
        Member m = members.get(memberIndex);
        meetings.get(meetingIndex).markPresent(m);
        attendanceGrid[memberIndex][meetingIndex] = true;
    }

    public void displayStats() {
        System.out.println("Attendance Stats:");

        for (int i = 0; i < members.size(); i++) {
            Member m = members.get(i);

            int missed = meetings.size() - m.getAttendanceCount();

            System.out.println(m.getName()
                + " | Attended: " + m.getAttendanceCount()
                + " | Missed: " + missed);
        }
    }

    public void displayMeetings() {
        for (int i = 0; i < meetings.size(); i++) {
            System.out.println((i + 1) + ". " + meetings.get(i).getDate());
        }
    }

    public void displayMembers() {
        for (int i = 0; i < members.size(); i++) {
            System.out.println((i + 1) + ". " + members.get(i).getName());
        }
    }
}
