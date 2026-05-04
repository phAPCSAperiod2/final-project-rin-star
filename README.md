# Club Attendance Tracker

## What This Software Does
This program allows users to track attendance for club meetings. Users can add members, record attendance for each meeting, view attendance statistics, and edit attendance records. The program helps organize participation and makes it easy to see which members are most active.

---

## Who It’s For
This software is designed for middle or high school students who are part of clubs or organizations. It solves the problem of keeping track of attendance across multiple meetings and helps identify active members.

---

## How to Run the Program
1. Open the project in a Java IDE (such as IntelliJ, Eclipse, or VS Code)
2. Make sure all `.java` files are in the same folder
3. Run the `Main.java` file
4. Follow the menu prompts in the console to use the program

---

## Technical Overview

### Main Classes:
- **Main** → Handles user input and menu system
- **Club** → Stores members and attendance records
- **Member** → Represents a club member and tracks attendance count
- **AttendanceRecord** → Stores attendance for a single meeting

### Key Data Structures:
- `ArrayList<Member>` → stores all club members
- `ArrayList<AttendanceRecord>` → stores all meetings
- `ArrayList<Member>` (inside AttendanceRecord) → stores attendees for each meeting

### Program Logic:
- Users interact through a menu system in `Main`
- Members are added to the club and stored in a list
- Each meeting creates an `AttendanceRecord`
- Attendance is recorded by adding members to a meeting
- Attendance counts are updated when members are marked present
- Users can edit records by removing members from meetings

---

## Class Diagram
- Member → stores name and attendance count  
- AttendanceRecord → stores meeting date and list of attendees  
- Club → stores all members and meetings  
- Main → controls program flow  

UML Diagram: https://drive.google.com/file/d/1u8aqq_Ht5RiR0I52d0C6EC_wWO1kCr1Y/view?usp=sharing

---

## Known Limitations / Future Improvements
- No graphical user interface (console-based only)
- Limited input validation (can crash with invalid input)
- Does not prevent duplicate attendance entries
- Future improvements:
  - Add input validation
  - Prevent duplicate attendance
  - Add GUI interface
  - Track absences and reasons for absence
  - Support multiple clubs
