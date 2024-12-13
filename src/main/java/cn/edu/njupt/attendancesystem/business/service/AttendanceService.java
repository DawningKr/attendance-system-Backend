package cn.edu.njupt.attendancesystem.business.service;

import cn.edu.njupt.attendancesystem.business.mapper.AttendanceMapper;
import cn.edu.njupt.attendancesystem.entity.Attendance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendanceService {
    @Autowired
    private AttendanceMapper attendanceMapper;

    public Attendance selectInfoById(Integer id){
        return attendanceMapper.selectInfoById(id);
    }

    public List<Attendance> selectAll(){
        return attendanceMapper.selectAll();
    }

    public void updateInfo(Attendance attendance){
        attendanceMapper.updateInfo(attendance);
    }

    public void deleteInfoById(Integer id){
        attendanceMapper.deleteInfoById(id);
    }

    public void addInfo(Attendance attendance){
        attendanceMapper.addInfo(attendance);
    }

    public List<Attendance> selectInfoByStudentId(String studentId){
        return attendanceMapper.selectInfoByStudentId(studentId);
    }
}
