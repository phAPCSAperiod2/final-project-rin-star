import java.util.ArrayList;

public class Club {
    private ArrayList<Member> members;
    private ArrayList<AttendanceRecord> meetings;

    public Club() {
        members = new ArrayList<Member>();
        meetings = new ArrayList<AttendanceRecord>();
    }

    public void addMember(String name) {
        members.add(new Member(name));
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public ArrayList<AttendanceRecord> getMeetings() {
        return meetings;
    }

    public void addMeeting(String date) {
        meetings.add(new AttendanceRecord(date));
    }

    public void displayMembers() {
        for (int i = 0; i < members.size(); i++) {
            System.out.println((i + 1) + ". " + members.get(i).getName());
        }
    }

    public void displayStats() {
        System.out.println("Attendance Stats:");
        for (int i = 0; i < members.size(); i++) {
            System.out.println(members.get(i));
        }
    }

    public void displayMeetings() {
        for (int i = 0; i < meetings.size(); i++) {
            System.out.println((i + 1) + ". " + meetings.get(i).getDate());
        }
    }
}
