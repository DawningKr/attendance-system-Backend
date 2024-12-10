package cn.edu.njupt.attendancesystem.business.mapper;

import cn.edu.njupt.attendancesystem.entity.Attendance;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AttendanceMapper {

    Attendance selectInfoById(Integer id);
}
