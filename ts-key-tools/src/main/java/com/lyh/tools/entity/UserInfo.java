package com.lyh.tools.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

public class UserInfo implements Serializable {
    @JSONField(name = "all_count")
    private String allCount;

    @JSONField(name = "api_token")
    private String apiToken;

    private String avatar;

    private String balance;

    @JSONField(name = "channel")
    private Channel channel;

    @JSONField(name = "day_count")
    private String dayCount;

    @JSONField(name = "download_all_count")
    private String downloadAllCount;

    @JSONField(name = "download_count")
    private String downloadCount;

    @JSONField(name = "download_info")
    private String downloadInfo;

    @JSONField(name = "free_expire")
    private String freeExpire;

    private String id;

    @JSONField(name = "invite_code")
    private String inviteCode;

    @JSONField(name = "invite_me_code")
    private String inviteMeCode;

    @JSONField(name = "invite")
    private String inviteNum;

    @JSONField(name = "is_vip")
    private boolean isVip;

    @JSONField(name = "last_login_at")
    private String lastLoginAt;

    private String mobile;

    @JSONField(name = "nick_name")
    private String nickName;

    @JSONField(name = "remain_day")
    private String remainDay;

    private String salt;

    private String sign;

    private int type;

    @JSONField(name = "view_info")
    private String viewInfo;

    @JSONField(name = "vip_expire")
    private long vipExpire;

    public String getAllCount() {
        return this.allCount;
    }

    public String getApiToken() {
        return this.apiToken;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getBalance() {
        return this.balance;
    }

    public Channel getChannel() {
        return this.channel;
    }

    public String getDayCount() {
        return this.dayCount;
    }

    public String getDownloadAllCount() {
        return this.downloadAllCount;
    }

    public String getDownloadCount() {
        return this.downloadCount;
    }

    public String getDownloadInfo() {
        return this.downloadInfo;
    }

    public String getFreeExpire() {
        return this.freeExpire;
    }

    public String getId() {
        return this.id;
    }

    public String getInviteCode() {
        return this.inviteCode;
    }

    public String getInviteMeCode() {
        return this.inviteMeCode;
    }

    public String getInviteNum() {
        return this.inviteNum;
    }

    public String getLastLoginAt() {
        return this.lastLoginAt;
    }

    public String getMobile() {
        return this.mobile;
    }

    public String getNickName() {
        return this.nickName;
    }

    public String getRemainDay() {
        return this.remainDay;
    }

    public String getSalt() {
        return this.salt;
    }

    public String getSign() {
        return this.sign;
    }

    public int getType() {
        return this.type;
    }

    public String getViewInfo() {
        return this.viewInfo;
    }

    public long getVipExpire() {
        return this.vipExpire;
    }

    public boolean isVip() {
        return this.isVip;
    }

    public void setAllCount(String paramString) {
        this.allCount = paramString;
    }

    public void setApiToken(String paramString) {
        this.apiToken = paramString;
    }

    public void setAvatar(String paramString) {
        this.avatar = paramString;
    }

    public void setBalance(String paramString) {
        this.balance = paramString;
    }

    public void setChannel(Channel paramChannel) {
        this.channel = paramChannel;
    }

    public void setDayCount(String paramString) {
        this.dayCount = paramString;
    }

    public void setDownloadAllCount(String paramString) {
        this.downloadAllCount = paramString;
    }

    public void setDownloadCount(String paramString) {
        this.downloadCount = paramString;
    }

    public void setDownloadInfo(String paramString) {
        this.downloadInfo = paramString;
    }

    public void setFreeExpire(String paramString) {
        this.freeExpire = paramString;
    }

    public void setId(String paramString) {
        this.id = paramString;
    }

    public void setInviteCode(String paramString) {
        this.inviteCode = paramString;
    }

    public void setInviteMeCode(String paramString) {
        this.inviteMeCode = paramString;
    }

    public void setInviteNum(String paramString) {
        this.inviteNum = paramString;
    }

    public void setLastLoginAt(String paramString) {
        this.lastLoginAt = paramString;
    }

    public void setMobile(String paramString) {
        this.mobile = paramString;
    }

    public void setNickName(String paramString) {
        this.nickName = paramString;
    }

    public void setRemainDay(String paramString) {
        this.remainDay = paramString;
    }

    public void setSalt(String paramString) {
        this.salt = paramString;
    }

    public void setSign(String paramString) {
        this.sign = paramString;
    }

    public void setType(int paramInt) {
        this.type = paramInt;
    }

    public void setViewInfo(String paramString) {
        this.viewInfo = paramString;
    }

    public void setVip(boolean paramBoolean) {
        this.isVip = paramBoolean;
    }

    public void setVipExpire(long paramLong) {
        this.vipExpire = paramLong;
    }
}

