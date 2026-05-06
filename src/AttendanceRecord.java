import java.util.ArrayList;

/**
 * Represents one meeting and who attended it.
 */
public class AttendanceRecord {
    private String date;
    private ArrayList<Member> attendees;

    public AttendanceRecord(String date) {
        this.date = date;
        this.attendees = new ArrayList<Member>();
    }

    public String getDate() {
        return date;
    }

    public ArrayList<Member> getAttendees() {
        return attendees;
    }

    public void markPresent(Member member) {
        if (!attendees.contains(member)) {
            attendees.add(member);
            member.addAttendance();
        }
    }

    public void removeMember(Member member) {
        for (int i = 0; i < attendees.size(); i++) {
            if (attendees.get(i).getName().equalsIgnoreCase(member.getName())) {
                attendees.remove(i);
                member.removeAttendance();
                i--;
            }
        }
    }

    public void displayAttendance() {
        System.out.println("Meeting Date: " + date);
        for (int i = 0; i < attendees.size(); i++) {
            System.out.println("- " + attendees.get(i).getName());
        }
    }
}
