package com.zhiyou100.pojo;

import java.sql.Timestamp;

public class User {
    private Integer uid;
    private String uname;
    private String upwd;
    private Integer udid;
    private Integer urid;
    private String usex;
    private String uphone;
    private String uaddress;
    private Integer uage;
    private String utel;
    private String uIDCard;
    private String uemail;
    private String uqq;
    private String uhobby;
    private Integer uedu;
    private String usalaryID;
    private String unation;
    private String umarry;
    private String uremark;
    private Timestamp uuTime;

    public User() {
    }

    public User(Integer uid, String uname, String upwd, Integer udid, Integer urid, String usex, String uphone, String uaddress, Integer uage, String utel, String uIDCard, String uemail, String uqq, String uhobby, Integer uedu, String usalaryID, String unation, String umarry, String uremark, Timestamp uuTime) {
        this.uid = uid;
        this.uname = uname;
        this.upwd = upwd;
        this.udid = udid;
        this.urid = urid;
        this.usex = usex;
        this.uphone = uphone;
        this.uaddress = uaddress;
        this.uage = uage;
        this.utel = utel;
        this.uIDCard = uIDCard;
        this.uemail = uemail;
        this.uqq = uqq;
        this.uhobby = uhobby;
        this.uedu = uedu;
        this.usalaryID = usalaryID;
        this.unation = unation;
        this.umarry = umarry;
        this.uremark = uremark;
        this.uuTime = uuTime;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public Integer getUdid() {
        return udid;
    }

    public void setUdid(Integer udid) {
        this.udid = udid;
    }

    public Integer getUrid() {
        return urid;
    }

    public void setUrid(Integer urid) {
        this.urid = urid;
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex;
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone;
    }

    public String getUaddress() {
        return uaddress;
    }

    public void setUaddress(String uaddress) {
        this.uaddress = uaddress;
    }

    public Integer getUage() {
        return uage;
    }

    public void setUage(Integer uage) {
        this.uage = uage;
    }

    public String getUtel() {
        return utel;
    }

    public void setUtel(String utel) {
        this.utel = utel;
    }

    public String getuIDCard() {
        return uIDCard;
    }

    public void setuIDCard(String uIDCard) {
        this.uIDCard = uIDCard;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public String getUqq() {
        return uqq;
    }

    public void setUqq(String uqq) {
        this.uqq = uqq;
    }

    public String getUhobby() {
        return uhobby;
    }

    public void setUhobby(String uhobby) {
        this.uhobby = uhobby;
    }

    public Integer getUedu() {
        return uedu;
    }

    public void setUedu(Integer uedu) {
        this.uedu = uedu;
    }

    public String getUsalaryID() {
        return usalaryID;
    }

    public void setUsalaryID(String usalaryID) {
        this.usalaryID = usalaryID;
    }

    public String getUnation() {
        return unation;
    }

    public void setUnation(String unation) {
        this.unation = unation;
    }

    public String getUmarry() {
        return umarry;
    }

    public void setUmarry(String umarry) {
        this.umarry = umarry;
    }

    public String getUremark() {
        return uremark;
    }

    public void setUremark(String uremark) {
        this.uremark = uremark;
    }

    public Timestamp getUuTime() {
        return uuTime;
    }

    public void setUuTime(Timestamp uuTime) {
        this.uuTime = uuTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upwd='" + upwd + '\'' +
                ", udid=" + udid +
                ", urid=" + urid +
                ", usex='" + usex + '\'' +
                ", uphone='" + uphone + '\'' +
                ", uaddress='" + uaddress + '\'' +
                ", uage=" + uage +
                ", utel='" + utel + '\'' +
                ", uIDCard='" + uIDCard + '\'' +
                ", uemail='" + uemail + '\'' +
                ", uqq='" + uqq + '\'' +
                ", uhobby='" + uhobby + '\'' +
                ", uedu=" + uedu +
                ", usalaryID='" + usalaryID + '\'' +
                ", unation='" + unation + '\'' +
                ", umarry='" + umarry + '\'' +
                ", uremark='" + uremark + '\'' +
                ", uuTime=" + uuTime +
                '}';
    }
}
