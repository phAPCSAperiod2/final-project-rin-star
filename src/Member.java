/**
 * The Member class represents a club member.
 * It stores the member's name and tracks their attendance count.
 */
public class Member {
    private String name;
    private int attendanceCount;

    /**
     * Constructs a Member with a given name and sets attendance to 0.
     *
     * @param name the name of the member
     */
    public Member(String name) {
        this.name = name;
        attendanceCount = 0;
    }

    /**
     * Returns the name of the member.
     *
     * @return the member's name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the number of times the member has attended meetings.
     *
     * @return attendance count
     */
    public int getAttendanceCount() {
        return attendanceCount;
    }

    /**
     * Increases the member's attendance count by 1.
     */
    public void addAttendance() {
        attendanceCount++;
    }

    /**
     * Decreases the member's attendance count by 1 if it is greater than 0.
     */
    public void removeAttendance() {
        if (attendanceCount > 0) {
            attendanceCount--;
        }
    }

    /**
     * Returns a formatted string showing the member's name and attendance.
     *
     * @return string representation of the member
     */
    public String toString() {
        return name + " - Attendance: " + attendanceCount;
    }
}
