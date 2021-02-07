package com.taotao.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Serviceprocal {
    private String serviceid;

    private String servicename;

    private Date timedate;

    private BigDecimal consumtime;

    private String biztrackno;

    private String ip;

    private Date transdate;

    public String getServiceid() {
        return serviceid;
    }

    public void setServiceid(String serviceid) {
        this.serviceid = serviceid == null ? null : serviceid.trim();
    }

    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename == null ? null : servicename.trim();
    }

    public Date getTimedate() {
        return timedate;
    }

    public void setTimedate(Date timedate) {
        this.timedate = timedate;
    }

    public BigDecimal getConsumtime() {
        return consumtime;
    }

    public void setConsumtime(BigDecimal consumtime) {
        this.consumtime = consumtime;
    }

    public String getBiztrackno() {
        return biztrackno;
    }

    public void setBiztrackno(String biztrackno) {
        this.biztrackno = biztrackno == null ? null : biztrackno.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Date getTransdate() {
        return transdate;
    }

    public void setTransdate(Date transdate) {
        this.transdate = transdate;
    }
}