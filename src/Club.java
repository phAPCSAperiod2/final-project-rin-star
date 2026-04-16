import java.util.ArrayList;

public class Club {
    private ArrayList<Member> members;
    private ArrayList<AttendanceRecord> records;

    public Club() {
        members = new ArrayList<>();
        records = new ArrayList<>();
    }

    public void addMember(String name) {
        members.add(new Member(name));
    }

    public void addAttendanceRecord(String date) {
        records.add(new AttendanceRecord(date));
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public ArrayList<AttendanceRecord> getRecords() {
        return records;
    }

    public void displayMembers() {
        System.out.println("Club Members:");
        for (int i = 0; i < members.size(); i++) {
            System.out.println("- " + members.get(i));
        }
    }

    public void displayAllAttendance() {
        for (int i = 0; i < records.size(); i++) {
            records.get(i).displayAttendees();
        }
    }
}
