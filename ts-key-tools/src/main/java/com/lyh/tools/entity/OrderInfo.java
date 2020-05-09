package com.lyh.tools.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

public class OrderInfo implements Serializable {
    @JSONField(name = "created_at")
    private String createAt;

    private String id;

    @JSONField(name = "order_no")
    private String orderNo;

    @JSONField(name = "paid_at")
    private String paidAt;

    @JSONField(name = "pay_status")
    private int payStatus;

    @JSONField(name = "pay_status_label")
    private String payStatusLabel;

    private String price;

    @JSONField(name = "recharge_title")
    private String rechargeTitle;

    public String getCreateAt() {
        return this.createAt;
    }

    public String getId() {
        return this.id;
    }

    public String getOrderNo() {
        return this.orderNo;
    }

    public String getPaidAt() {
        return this.paidAt;
    }

    public int getPayStatus() {
        return this.payStatus;
    }

    public String getPayStatusLabel() {
        return this.payStatusLabel;
    }

    public String getPrice() {
        return this.price;
    }

    public String getRechargeTitle() {
        return this.rechargeTitle;
    }

    public void setCreateAt(String paramString) {
        this.createAt = paramString;
    }

    public void setId(String paramString) {
        this.id = paramString;
    }

    public void setOrderNo(String paramString) {
        this.orderNo = paramString;
    }

    public void setPaidAt(String paramString) {
        this.paidAt = paramString;
    }

    public void setPayStatus(int paramInt) {
        this.payStatus = paramInt;
    }

    public void setPayStatusLabel(String paramString) {
        this.payStatusLabel = paramString;
    }

    public void setPrice(String paramString) {
        this.price = paramString;
    }

    public void setRechargeTitle(String paramString) {
        this.rechargeTitle = paramString;
    }
}

