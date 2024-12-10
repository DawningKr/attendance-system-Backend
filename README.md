## 大学生考勤系统后端
## Attendance System Backend

数据库建库建表sql语句

```sql
create database if not exists attendance_db
use attendance_db

create table students(
id varchar(50) primary key ,
name varchar(50) not null ,
section varchar(50) not null
);

create table attendances(
id int auto_increment primary key ,
fk_student_id varchar(50) not null ,
date DATETIME not null,
status int(2) not null		-- 标识考勤状态，0为出勤，1为旷课，2为事假，3为病假，4为迟到，5为早退
);
```

#### Requirements
* Java 17
* Springboot 3.4.0
* Spring Mvc
* MySQL 8.4
* Mybatis framework + MySQL Driver