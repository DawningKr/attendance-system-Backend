package cn.edu.njupt.attendancesystem.business.mapper;

import cn.edu.njupt.attendancesystem.entity.Attendance;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AttendanceMapper {

    Attendance selectInfoById(Integer id);
    List<Attendance> selectAll();
    void updateInfo(Attendance attendance);
    void deleteInfoById(Integer id);
    void addInfo(Attendance attendance);
    List<Attendance> selectInfoByStudentId(String studentId);
}
