# Club Attendance Tracker

## What This Software Does
This program tracks attendance for club meetings. Users can add members, record attendance for each meeting, view statistics, and edit attendance records. It helps organize participation and makes it easy to see how often each member attends.

---

## Who It’s For
This software is designed for students in clubs or organizations (middle or high school level). It solves the problem of manually tracking attendance and helps identify participation trends across meetings.

---

## How to Run the Program
1. Open the project in a Java IDE (IntelliJ, Eclipse, or VS Code)
2. Ensure all `.java` files are in the same folder
3. Run `Main.java`
4. Follow the menu prompts in the console

---

## Technical Overview

### Main Classes
- Main → Handles user input and menu navigation  
- Club → Stores members, meetings, and attendance data  
- Member → Represents a member and tracks attendance count  
- AttendanceRecord → Stores attendance for a single meeting  

---

### Key Data Structures
- ArrayList<Member> → stores all members  
- ArrayList<AttendanceRecord> → stores all meetings  
- ArrayList<Member> (inside AttendanceRecord) → stores attendees per meeting  
- boolean[][] attendanceGrid → tracks attendance in a 2D structure  

---

### Program Logic
- Users interact through a console menu in Main  
- Members are added and stored in a list  
- Each meeting creates an AttendanceRecord  
- Attendance is recorded and stored in both lists and a 2D array  
- Attendance counts are updated when members are marked present  
- Users can edit attendance by toggling member status per meeting  

---

## Class Diagram
- Member → stores name and attendance count  
- AttendanceRecord → stores meeting date and attendees list  
- Club → manages members, meetings, and 2D attendance grid  
- Main → controls program flow and user interaction  

UML Diagram:
https://drive.google.com/file/d/1u8aqq_Ht5RiR0I52d0C6EC_wWO1kCr1Y/view?usp=sharing  

---

## Known Limitations / Future Improvements
- Console-based (no graphical interface yet)  
- Limited input validation  
- No prevention of duplicate attendance entries in some cases  
- 2D array capacity limited to 50x50  

### Future Improvements
- Add input validation to prevent crashes  
- Prevent duplicate attendance entries completely  
- Add GUI version (JavaFX or Swing)  
- Track absences with reasons  
- Support multiple clubs  
