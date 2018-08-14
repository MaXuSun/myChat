package com.maxu.mychat.model;

public class msgUser {
    private Integer msgfrom;

    private Integer msgto;

    private String msgtime;

    private String msgcontent;

    public Integer getMsgfrom() {
        return msgfrom;
    }

    public void setMsgfrom(Integer msgfrom) {
        this.msgfrom = msgfrom;
    }

    public Integer getMsgto() {
        return msgto;
    }

    public void setMsgto(Integer msgto) {
        this.msgto = msgto;
    }

    public String getMsgtime() {
        return msgtime;
    }

    public void setMsgtime(String msgtime) {
        this.msgtime = msgtime == null ? null : msgtime.trim();
    }

    public String getMsgcontent() {
        return msgcontent;
    }

    public void setMsgcontent(String msgcontent) {
        this.msgcontent = msgcontent == null ? null : msgcontent.trim();
    }
}