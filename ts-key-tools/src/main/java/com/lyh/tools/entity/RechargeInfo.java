package com.lyh.tools.entity;

import java.io.Serializable;

public class RechargeInfo implements Serializable {
    private String oid;

    private String payUrl;

    private String sign;

    private int target;

    public String getOid() {
        return this.oid;
    }

    public String getPayUrl() {
        return this.payUrl;
    }

    public String getSign() {
        return this.sign;
    }

    public int getTarget() {
        return this.target;
    }

    public void setOid(String paramString) {
        this.oid = paramString;
    }

    public void setPayUrl(String paramString) {
        this.payUrl = paramString;
    }

    public void setSign(String paramString) {
        this.sign = paramString;
    }

    public void setTarget(int paramInt) {
        this.target = paramInt;
    }
}

