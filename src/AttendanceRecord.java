import java.util.ArrayList;

public class AttendanceRecord {
    private String date;
    private ArrayList<Member> attendees;

    public AttendanceRecord(String date) {
        this.date = date;
        attendees = new ArrayList<>();
    }

    public String getDate() {
        return date;
    }

    public void markPresent(Member member) {
        attendees.add(member);
        //automatically updates attendance
        member.incrementAttendance();
    }

    public ArrayList<Member> getAttendees() {
        return attendees;
    }

    public void displayAttendees() {
        System.out.println("Attendance for " + date + ":");
        for (int i = 0; i < attendees.size(); i++) {
            System.out.println("- " + attendees.get(i).getName());
        }
    }
}
