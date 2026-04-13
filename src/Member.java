public class Member {
    private String name;
    private int attendanceCount;

    public Member(String name) {
        this.name = name;
        this.attendanceCount = 0;
    }

    public String getName() {
        return name;
    }

    public int getAttendanceCount() {
        return attendanceCount;
    }

    public void incrementAttendance() {
        attendanceCount++;
    }

    public String toString() {
        return name + " (Attendance: " + attendanceCount + ")";
    }
}
