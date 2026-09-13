class AttendanceEmployee {
    String name; boolean attendanceMarked;
    AttendanceEmployee(String name) { this.name = name; }
    void markAttendance() {
        if (!attendanceMarked) { attendanceMarked = true; System.out.println(name + " attendance marked"); }
        else System.out.println("Attendance already marked");
    }
}
public class EmployeeAttendance {
    public static void main(String[] args) {
        AttendanceEmployee e = new AttendanceEmployee("Student"); e.markAttendance(); e.markAttendance();
    }
}
