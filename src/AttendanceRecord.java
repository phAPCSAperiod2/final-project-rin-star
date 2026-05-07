import java.util.ArrayList;

/**
 * Represents a single meeting and tracks which members attended.
 */
public class AttendanceRecord {

    /** Date of meeting */
    private String date;

    /** List of attendees */
    private ArrayList<Member> attendees;

    /**
     * Creates a meeting record.
     *
     * @param date meeting date
     */
    public AttendanceRecord(String date) {
        this.date = date;
        this.attendees = new ArrayList<Member>();
    }

    /**
     * Returns meeting date.
     */
    public String getDate() {
        return date;
    }

    /**
     * Returns attendees list.
     */
    public ArrayList<Member> getAttendees() {
        return attendees;
    }

    /**
     * Marks member as present.
     */
    public void markPresent(Member member) {
        if (!attendees.contains(member)) {
            attendees.add(member);
            member.addAttendance();
        }
    }

    /**
     * Removes member from attendance.
     */
    public void removeMember(Member member) {
        for (int i = 0; i < attendees.size(); i++) {
            if (attendees.get(i).getName().equalsIgnoreCase(member.getName())) {
                attendees.remove(i);
                member.removeAttendance();
                i--;
            }
        }
    }

    /**
     * Displays attendance list.
     */
    public void displayAttendance() {
        System.out.println("Meeting Date: " + date);
        for (Member m : attendees) {
            System.out.println("- " + m.getName());
        }
    }
}
