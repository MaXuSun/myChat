package com.maxu.mychat.model;

public class MsgGroup {
    private Integer msgfrom;

    private String msgcontent;

    private String msgtime;

    public Integer getMsgfrom() {
        return msgfrom;
    }

    public void setMsgfrom(Integer msgfrom) {
        this.msgfrom = msgfrom;
    }

    public String getMsgcontent() {
        return msgcontent;
    }

    public void setMsgcontent(String msgcontent) {
        this.msgcontent = msgcontent == null ? null : msgcontent.trim();
    }

    public String getMsgtime() {
        return msgtime;
    }

    public void setMsgtime(String msgtime) {
        this.msgtime = msgtime == null ? null : msgtime.trim();
    }
}