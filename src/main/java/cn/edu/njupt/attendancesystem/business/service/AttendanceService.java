package cn.edu.njupt.attendancesystem.business.service;

import cn.edu.njupt.attendancesystem.business.mapper.AttendanceMapper;
import cn.edu.njupt.attendancesystem.entity.Attendance;
import cn.edu.njupt.attendancesystem.utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    public List<Attendance> selectInfoByDate(String date){
        List<Attendance> attendances = attendanceMapper.selectAll();
        List<Attendance> result = new ArrayList<>();
        attendances.forEach(attendance -> {
            String time = Util.time2String(attendance.getTime().toLocalDateTime());
            if (time.startsWith(date)){
                result.add(attendance);
            }
        });
        return result;
    }
}
