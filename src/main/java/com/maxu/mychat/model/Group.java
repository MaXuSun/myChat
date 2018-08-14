package com.maxu.mychat.model;

public class Group {
    private Integer groupid;

    private String groupname;

    private Integer groupuserid;

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname == null ? null : groupname.trim();
    }

    public Integer getGroupuserid() {
        return groupuserid;
    }

    public void setGroupuserid(Integer groupuserid) {
        this.groupuserid = groupuserid;
    }
}