public class Main {
    public static void main(String[] args) {
        Club club = new Club();

        club.addMember("Alice");
        club.addMember("Bob");
        club.addMember("Charlie");

        club.addAttendanceRecord("April 1");


        AttendanceRecord meeting = club.getRecords().get(0);

        meeting.markPresent(club.getMembers().get(0)); 
        meeting.markPresent(club.getMembers().get(1));

        club.addAttendanceRecord("April 8");
        AttendanceRecord meeting2 = club.getRecords().get(1);

        meeting2.markPresent(club.getMembers().get(1)); 
        meeting2.markPresent(club.getMembers().get(2));

        club.displayMembers();
        System.out.println();
        club.displayAllAttendance();
    }
}
