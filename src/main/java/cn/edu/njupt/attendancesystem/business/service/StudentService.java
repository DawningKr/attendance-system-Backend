package cn.edu.njupt.attendancesystem.business.service;

import cn.edu.njupt.attendancesystem.business.mapper.StudentMapper;
import cn.edu.njupt.attendancesystem.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;

    public Student selectStudentById(String id){
        return studentMapper.selectStudentById(id);
    }
}
