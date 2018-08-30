package com.maxu.mychat.model;

import java.util.HashMap;

public class User {
    private Integer userid;

    private String userpassword;

    private String usernickname;

    private Integer usergender;

    private Integer userage;

    private String userprofiledhead;

    private String userprofile;

    private String userbirthday;

    private String useremail;

    private String userip;
    
   

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword == null ? null : userpassword.trim();
    }

    public String getUsernickname() {
        return usernickname;
    }

    public void setUsernickname(String usernickname) {
        this.usernickname = usernickname == null ? null : usernickname.trim();
    }

    public Integer getUsergender() {
        return usergender;
    }

    public void setUsergender(Integer usergender) {
        this.usergender = usergender;
    }

    public Integer getUserage() {
        return userage;
    }

    public void setUserage(Integer userage) {
        this.userage = userage;
    }

    public String getUserprofiledhead() {
        return userprofiledhead;
    }

    public void setUserprofiledhead(String userprofiledhead) {
        this.userprofiledhead = userprofiledhead == null ? null : userprofiledhead.trim();
    }

    public String getUserprofile() {
        return userprofile;
    }

    public void setUserprofile(String userprofile) {
        this.userprofile = userprofile == null ? null : userprofile.trim();
    }

    public String getUserbirthday() {
        return userbirthday;
    }

    public void setUserbirthday(String userbirthday) {
        this.userbirthday = userbirthday == null ? null : userbirthday.trim();
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail == null ? null : useremail.trim();
    }

    public String getUserip() {
        return userip;
    }

    public void setUserip(String userip) {
        this.userip = userip == null ? null : userip.trim();
    }
}