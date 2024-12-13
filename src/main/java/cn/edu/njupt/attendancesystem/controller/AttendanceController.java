package cn.edu.njupt.attendancesystem.controller;

import cn.edu.njupt.attendancesystem.business.service.AttendanceService;
import cn.edu.njupt.attendancesystem.business.service.StudentService;
import cn.edu.njupt.attendancesystem.common.Info;
import cn.edu.njupt.attendancesystem.common.Result;
import cn.edu.njupt.attendancesystem.entity.Attendance;
import cn.edu.njupt.attendancesystem.entity.Student;
import cn.edu.njupt.attendancesystem.utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/attendance")
public class AttendanceController {

    @Autowired
    private AttendanceService attendanceService;

    @Autowired
    private StudentService studentService;

    @GetMapping("/select/id/{id}")
    public Result selectInfoById(@PathVariable Integer id){
        Attendance attendance = attendanceService.selectInfoById(id);
        Info info = convert(attendance);
        return new Result(info, null, true);
    }

    @GetMapping("/select/all")
    public Result selectAll(){
        List<Attendance> list = attendanceService.selectAll();
        List<Info> result = new ArrayList<>(list.size());
        list.forEach(attendance -> result.add(convert(attendance)));
        return new Result(result, null, true);
    }

    @PutMapping("/update")
    public Result updateAttendance(@RequestBody Info info){
        if (Objects.isNull(info.getAttendanceStatus())){
            return new Result(null, "Nothing is changed.", false);
        }
        Attendance attendance = new Attendance();
        attendance.setId(info.getAttendanceId());
        attendance.setStatus(Util.string2Integer(info.getAttendanceStatus()));
        attendanceService.updateInfo(attendance);
        return new Result();
    }

    @DeleteMapping("/delete/{id}")
    public Result deleteAttendance(@PathVariable Integer id){
        attendanceService.deleteInfoById(id);
        return new Result();
    }

    @PostMapping("/add")
    public Result addAttendance(@RequestBody Info info){
        Attendance attendance = new Attendance();
        String studentId = info.getStudentId();
        Student student = studentService.selectStudentById(studentId);
        if (Objects.isNull(student)){
            // TODO: add new student
        }
        attendance.setFkStudentId(studentId);
        attendance.setStatus(Util.string2Integer(info.getAttendanceStatus()));
        attendance.setDate(Timestamp.valueOf(LocalDateTime.now()));
        attendanceService.addInfo(attendance);
        return new Result();
    }

    @GetMapping("/select/studentId/{studentId}")
    public Result selectInfoByStudentId(@PathVariable String studentId){
        List<Attendance> attendances = attendanceService.selectInfoByStudentId(studentId);
        List<Info> result = new ArrayList<>(attendances.size());
        attendances.forEach(attendance -> {
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
