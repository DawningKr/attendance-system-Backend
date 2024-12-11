package cn.edu.njupt.attendancesystem.controller;

import cn.edu.njupt.attendancesystem.business.service.AttendanceService;
import cn.edu.njupt.attendancesystem.business.service.StudentService;
import cn.edu.njupt.attendancesystem.common.Info;
import cn.edu.njupt.attendancesystem.common.Result;
import cn.edu.njupt.attendancesystem.entity.Attendance;
import cn.edu.njupt.attendancesystem.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/attendance")
public class AttendanceController {

    @Autowired
    private AttendanceService attendanceService;

    @Autowired
    private StudentService studentService;

    @GetMapping("/select/{id}")
    public Result selectInfoById(@PathVariable Integer id){
        Attendance attendance = attendanceService.selectInfoById(id);
        Info info = convert(attendance);
        return new Result(info, null, true);
    }

    @GetMapping("/select/all")
    public Result selectAll(){
        List<Attendance> list = attendanceService.selectAll();
        List<Info> result = new ArrayList<>(list.size());
        list.forEach(attendance -> {
            result.add(convert(attendance));
        });
        return new Result(result, null, true);
    }

    private Info convert(Attendance attendance){
        String studentId = attendance.getFkStudentId();
        Student student = studentService.selectStudentById(studentId);
        return new Info(attendance, student);
    }
}
