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
    private String attendanceStatus;

    public Info(Attendance attendance, Student student){
        this.attendanceId = attendance.getId();
        LocalDateTime timeDB = attendance.getTime().toLocalDateTime();
        this.attendanceTime = Util.time2String(timeDB);
        int status = attendance.getStatus();
        this.attendanceStatus = Util.integer2String(status);
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

    public String getAttendanceStatus() {
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

    public void setAttendanceStatus(String attendanceStatus) {
        this.attendanceStatus = attendanceStatus;
    }

    @Override
    public String toString() {
        return "Info{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentSection='" + studentSection + '\'' +
                ", attendanceId=" + attendanceId +
                ", attendanceTime='" + attendanceTime + '\'' +
                ", attendanceStatus='" + attendanceStatus + '\'' +
                '}';
    }
}
