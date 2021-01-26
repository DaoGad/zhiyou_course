package com.zhiyou100.pojo;

import java.sql.Timestamp;

public class Mail {
    private Integer mid;
    private Integer msendid;
    private Integer mreceiveid;
    private String mtheme;
    private String mcontent;
    private Timestamp msendtime;
    private Integer msendstatus;
    private Integer mreceivestatus;

    public Mail() {
    }

    public Mail(Integer mid, Integer msendid, Integer mreceiveid, String mtheme, String mcontent, Timestamp msendtime, Integer msendstatus, Integer mreceivestatus) {
        this.mid = mid;
        this.msendid = msendid;
        this.mreceiveid = mreceiveid;
        this.mtheme = mtheme;
        this.mcontent = mcontent;
        this.msendtime = msendtime;
        this.msendstatus = msendstatus;
        this.mreceivestatus = mreceivestatus;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getMsendid() {
        return msendid;
    }

    public void setMsendid(Integer msendid) {
        this.msendid = msendid;
    }

    public Integer getMreceiveid() {
        return mreceiveid;
    }

    public void setMreceiveid(Integer mreceiveid) {
        this.mreceiveid = mreceiveid;
    }

    public String getMtheme() {
        return mtheme;
    }

    public void setMtheme(String mtheme) {
        this.mtheme = mtheme;
    }

    public String getMcontent() {
        return mcontent;
    }

    public void setMcontent(String mcontent) {
        this.mcontent = mcontent;
    }

    public Timestamp getMsendtime() {
        return msendtime;
    }

    public void setMsendtime(Timestamp msendtime) {
        this.msendtime = msendtime;
    }

    public Integer getMsendstatus() {
        return msendstatus;
    }

    public void setMsendstatus(Integer msendstatus) {
        this.msendstatus = msendstatus;
    }

    public Integer getMreceivestatus() {
        return mreceivestatus;
    }

    public void setMreceivestatus(Integer mreceivestatus) {
        this.mreceivestatus = mreceivestatus;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "mid=" + mid +
                ", msendid=" + msendid +
                ", mreceiveid=" + mreceiveid +
                ", mtheme='" + mtheme + '\'' +
                ", mcontent='" + mcontent + '\'' +
                ", msendtime=" + msendtime +
                ", msendstatus=" + msendstatus +
                ", mreceivestatus=" + mreceivestatus +
                '}';
    }
}
