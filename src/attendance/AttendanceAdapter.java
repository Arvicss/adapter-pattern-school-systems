package attendance;

import target.SchoolManagementApp;

public class AttendanceAdapter implements SchoolManagementApp {
    private AttendanceSystem attendanceSystem;

    public void setAttendanceSystem(AttendanceSystem attendanceSystem) {
        this.attendanceSystem = attendanceSystem;
    }

    public AttendanceAdapter() {
    }

    public AttendanceSystem getAttendanceSystem() {
        return attendanceSystem;
    }

    public AttendanceAdapter(AttendanceSystem attendanceSystem) {
        this.attendanceSystem = attendanceSystem;
    }

    @Override
    public void integrateSystem() {
        attendanceSystem.markAttendance();
    }
}
