public class Member {
    private String name;
    private int attendanceCount;

    public Member(String name) {
        this.name = name;
        attendanceCount = 0;
    }

    public String getName() {
        return name;
    }

    public int getAttendanceCount() {
        return attendanceCount;
    }

    public void addAttendance() {
        attendanceCount++;
    }

    public void removeAttendance() {
        if (attendanceCount > 0) {
            attendanceCount--;
        }
    }

    public String toString() {
        return name + " - Attendance: " + attendanceCount;
    }
}
