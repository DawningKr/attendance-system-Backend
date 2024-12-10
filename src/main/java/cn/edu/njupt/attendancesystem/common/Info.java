package cn.edu.njupt.attendancesystem.common;

import cn.edu.njupt.attendancesystem.entity.Attendance;
import cn.edu.njupt.attendancesystem.entity.Student;
import cn.edu.njupt.attendancesystem.utils.Util;

import java.time.LocalDateTime;

/**
 * This is a "Date Transfer Object" class
 * which is used to transfer data through different sections
 */
public class Info{
    private String studentId;
    private String studentName;
    private String studentSection;
    private Integer attendanceId;
    private String attendanceTime;
    private Integer attendanceStatus;

    public Info(Attendance attendance, Student student){
        this.attendanceId = attendance.getId();
        LocalDateTime timeDB = attendance.getTime().toLocalDateTime();
        LocalDateTime preciseTime = timeDB.plusHours(8);
        this.attendanceTime = Util.time2String(preciseTime);
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

    public String getAttendanceTime() {
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

    public void setAttendanceTime(String attendanceTime) {
        this.attendanceTime = attendanceTime;
    }

    public void setAttendanceStatus(Integer attendanceStatus) {
        this.attendanceStatus = attendanceStatus;
    }
}
