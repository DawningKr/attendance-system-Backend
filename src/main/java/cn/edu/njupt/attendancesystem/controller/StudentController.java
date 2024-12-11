package cn.edu.njupt.attendancesystem.controller;

import cn.edu.njupt.attendancesystem.business.service.StudentService;
import cn.edu.njupt.attendancesystem.common.Result;
import cn.edu.njupt.attendancesystem.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/select/{id}")
    public Result findStudentById(@PathVariable String id){
        Student student = studentService.selectStudentById(id);
        return new Result(student, null, true);
    }


}
