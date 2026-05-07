/**
 * Represents a club member and tracks attendance count.
 */
public class Member {

    /** Member name */
    private String name;

    /** Number of meetings attended */
    private int attendanceCount;

    /**
     * Creates a new member.
     */
    public Member(String name) {
        this.name = name;
        this.attendanceCount = 0;
    }

    /**
     * Returns name.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns attendance count.
     */
    public int getAttendanceCount() {
        return attendanceCount;
    }

    /**
     * Increases attendance count.
     */
    public void addAttendance() {
        attendanceCount++;
    }

    /**
     * Decreases attendance count safely.
     */
    public void removeAttendance() {
        if (attendanceCount > 0) {
            attendanceCount--;
        }
    }

    /**
     * String representation of member.
     */
    public String toString() {
        return name + " - Attendance: " + attendanceCount;
    }
}
