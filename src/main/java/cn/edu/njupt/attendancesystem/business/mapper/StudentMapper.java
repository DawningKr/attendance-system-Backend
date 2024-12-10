package cn.edu.njupt.attendancesystem.business.mapper;

import cn.edu.njupt.attendancesystem.entity.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {

    Student selectStudentById(String id);

    // void addStudent(Student student);
}
