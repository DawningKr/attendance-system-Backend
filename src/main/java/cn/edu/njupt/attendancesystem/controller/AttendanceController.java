package cn.edu.njupt.attendancesystem.controller;

import cn.edu.njupt.attendancesystem.business.service.AttendanceService;
import cn.edu.njupt.attendancesystem.business.service.StudentService;
import cn.edu.njupt.attendancesystem.common.Info;
import cn.edu.njupt.attendancesystem.common.Result;
import cn.edu.njupt.attendancesystem.entity.Attendance;
import cn.edu.njupt.attendancesystem.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "/attendance", produces = "application/json")
public class AttendanceController {

    @Autowired
    private AttendanceService attendanceService;

    @Autowired
    private StudentService studentService;

    @GetMapping("/select/{id}")
    public Result selectInfoById(@PathVariable Integer id){
        Attendance attendance = attendanceService.selectInfoById(id);
        String studentId = attendance.getFkStudentId();
        Student student = studentService.selectStudentById(studentId);
        Info info = new Info(attendance, student);
        return new Result(info, null, true);
    }
}
