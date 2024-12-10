package cn.edu.njupt.attendancesystem.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Util {

    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static String time2String(LocalDateTime time){
        return time.format(fmt);
    }

    public static LocalDateTime string2Time(String time){
        return LocalDateTime.parse(time, fmt);
    }
}
