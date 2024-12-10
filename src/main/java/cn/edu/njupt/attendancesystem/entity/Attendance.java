package cn.edu.njupt.attendancesystem.entity;

import java.sql.Timestamp;

public class Attendance {
    private Integer id;
    private String fkStudentId;
    private Timestamp time;
    private Integer status;

    public Attendance(Integer id, String fk_student_id, Timestamp time, Integer status) {
        this.id = id;
        this.fkStudentId = fk_student_id;
        this.time = time;
        this.status = status;
    }

    public Attendance() {
    }

    public Integer getId() {
        return id;
    }

    public String getFkStudentId() {
        return fkStudentId;
    }

    public Timestamp getTime() {
        return time;
    }

    public Integer getStatus() {
        return status;
    }

    public void setDate(Timestamp time) {
        this.time = time;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFkStudentId(String fkStudentId) {
        this.fkStudentId = fkStudentId;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
