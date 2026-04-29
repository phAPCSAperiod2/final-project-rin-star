/**
 * The AttendanceRecord class represents a single club meeting.
 * It stores the meeting date and the list of members who attended.
 */
import java.util.ArrayList;

public class AttendanceRecord {
    private String date;
    private ArrayList<Member> attendees;

    /**
     * Constructs an AttendanceRecord for a specific date.
     *
     * @param date the date of the meeting
     */
    public AttendanceRecord(String date) {
        this.date = date;
        attendees = new ArrayList<Member>();
    }

    /**
     * Returns the date of the meeting.
     *
     * @return the meeting date
     */
    public String getDate() {
        return date;
    }

    /**
     * Returns the list of members who attended the meeting.
     *
     * @return ArrayList of Member objects
     */
    public ArrayList<Member> getAttendees() {
        return attendees;
    }

    /**
     * Marks a member as present and adds them to the attendance list.
     *
     * @param member the member who attended
     */
    public void markPresent(Member member) {
        attendees.add(member);
        member.addAttendance();
    }

    /**
     * Removes a member from the attendance list and updates their attendance count.
     *
     * @param member the member to remove
     */
    public void removeMember(Member member) {
        for (int i = 0; i < attendees.size(); i++) {
            if (attendees.get(i).getName().equals(member.getName())) {
                attendees.remove(i);
                member.removeAttendance();
                i--;
            }
        }
    }

    /**
     * Displays all attendees for this meeting.
     */
    public void displayAttendance() {
        System.out.println("Meeting Date: " + date);
        for (int i = 0; i < attendees.size(); i++) {
            System.out.println((i + 1) + ". " + attendees.get(i).getName());
        }
    }
}
