package com.cn.shop.entity;

public class Address {
    private Integer aid;

    private String address;

    private Integer uid;

    private String getpelname;

    private String getpelnum;

    private Integer getpelcode;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getGetpelname() {
        return getpelname;
    }

    public void setGetpelname(String getpelname) {
        this.getpelname = getpelname == null ? null : getpelname.trim();
    }

    public String getGetpelnum() {
        return getpelnum;
    }

    public void setGetpelnum(String getpelnum) {
        this.getpelnum = getpelnum == null ? null : getpelnum.trim();
    }

    public Integer getGetpelcode() {
        return getpelcode;
    }

    public void setGetpelcode(Integer getpelcode) {
        this.getpelcode = getpelcode;
    }
}