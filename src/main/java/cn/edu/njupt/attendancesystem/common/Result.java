package cn.edu.njupt.attendancesystem.common;

public class Result {

    private Object data;
    private Boolean isSucceed;
    private String msg;

    public Result(Object data, String msg, Boolean isSucceed) {
        this.data = data;
        this.msg = msg;
        this.isSucceed = isSucceed;
    }

    public Result() {
    }

    public Object getData() {
        return data;
    }

    public String getMsg() {
        return msg;
    }

    public Boolean getIsSucceed() {
        return isSucceed;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setIsSucceed(Boolean isSucceed) {
        this.isSucceed = isSucceed;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
