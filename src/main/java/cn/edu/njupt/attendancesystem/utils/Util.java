package cn.edu.njupt.attendancesystem.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class Util {

    private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private static final Map<Integer, String> mapper = new HashMap<>();
    static {
        mapper.put(0, "出勤√");
        mapper.put(1, "旷课X");
        mapper.put(2, "事假△");
        mapper.put(3, "病假○");
        mapper.put(4, "迟到+");
        mapper.put(5, "早退–");
    }

    public static String time2String(LocalDateTime time){
        return time.format(fmt);
    }

    public static LocalDateTime string2Time(String time){
        return LocalDateTime.parse(time, fmt);
    }

    public static String integer2String(Integer status){
        return mapper.get(status);
    }
}
