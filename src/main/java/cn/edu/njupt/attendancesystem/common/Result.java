package cn.edu.njupt.attendancesystem.common;

public class Result {

    private Object data;
    private Boolean is_succeed;
    private String msg;

    public Result(Object data, String msg, Boolean is_succeed) {
        this.data = data;
        this.msg = msg;
        this.is_succeed = is_succeed;
    }

    public Result() {
    }

    public Object getData() {
        return data;
    }

    public String getMsg() {
        return msg;
    }

    public Boolean getIs_succeed() {
        return is_succeed;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setIs_succeed(Boolean is_succeed) {
        this.is_succeed = is_succeed;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
