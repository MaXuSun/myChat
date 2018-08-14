package com.maxu.mychat.model;

public class Log {
    private Integer logid;

    private Integer loguserid;

    private String logtime;

    private String logtype;

    private String logdetail;

    public Integer getLogid() {
        return logid;
    }

    public void setLogid(Integer logid) {
        this.logid = logid;
    }

    public Integer getLoguserid() {
        return loguserid;
    }

    public void setLoguserid(Integer loguserid) {
        this.loguserid = loguserid;
    }

    public String getLogtime() {
        return logtime;
    }

    public void setLogtime(String logtime) {
        this.logtime = logtime == null ? null : logtime.trim();
    }

    public String getLogtype() {
        return logtype;
    }

    public void setLogtype(String logtype) {
        this.logtype = logtype == null ? null : logtype.trim();
    }

    public String getLogdetail() {
        return logdetail;
    }

    public void setLogdetail(String logdetail) {
        this.logdetail = logdetail == null ? null : logdetail.trim();
    }
}