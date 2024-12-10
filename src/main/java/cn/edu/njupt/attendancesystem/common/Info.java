package cn.edu.njupt.attendancesystem.common;

import cn.edu.njupt.attendancesystem.entity.Attendance;
import cn.edu.njupt.attendancesystem.entity.Student;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

/**
 * This is a "Date Transfer Object" class
 * which is used to transfer data through different part
 */
public class Info{
    private String studentId;
    private String studentName;
    private String studentSection;
    private Integer attendanceId;
    private LocalDateTime attendanceTime;
    private Integer attendanceStatus;

    public Info(Attendance attendance, Student student){
        this.attendanceId = attendance.getId();
        LocalDateTime time_db = attendance.getTime().toLocalDateTime();
        this.attendanceTime = time_db.plusHours(8);
        this.attendanceStatus = attendance.getStatus();
        this.studentId = student.getId();
        this.studentName = student.getName();
        this.studentSection= student.getSection();
    }

    public Info() {
    }

    public String getStudentId() {
        return studentId;
    }

    public LocalDateTime getAttendanceTime() {
        return attendanceTime;
    }

    public Integer getAttendanceStatus() {
        return attendanceStatus;
    }

    public Integer getAttendanceId() {
        return attendanceId;
    }

    public String getStudentSection() {
        return studentSection;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentSection(String studentSection) {
        this.studentSection = studentSection;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setAttendanceId(Integer attendanceId) {
        this.attendanceId = attendanceId;
    }

    public void setAttendanceTime(LocalDateTime attendanceTime) {
        this.attendanceTime = attendanceTime;
    }

    public void setAttendanceStatus(Integer attendanceStatus) {
        this.attendanceStatus = attendanceStatus;
    }
}
