package com.lyh.tools.entity;

import java.io.Serializable;

public class VideoInfo implements Serializable {
    private AuthError authError;

    private String cover_oss_filename;

    private String cover_url;

    private String created_at;

    private String deleted_at;

    private int duration;

    private Integer id;

    private boolean is_collect;

    private int is_vip;

    private String online_time;

    private int play_count;

    private String play_url_m3u8;

    private int status;

    private String title;

    private String updated_at;

    private int view_time;

    private int coins;


    public AuthError getAuthError() {
        return this.authError;
    }

    public String getCover_oss_filename() {
        return this.cover_oss_filename;
    }

    public String getCover_url() {
        return this.cover_url;
    }

    public String getCreated_at() {
        return this.created_at;
    }

    public String getDeleted_at() {
        return this.deleted_at;
    }

    public int getDuration() {
        return this.duration;
    }

    public Integer getId() {
        return this.id;
    }

    public int getIs_vip() {
        return this.is_vip;
    }

    public String getOnline_time() {
        return this.online_time;
    }

    public int getPlay_count() {
        return this.play_count;
    }

    public String getPlay_url_m3u8() {
        return this.play_url_m3u8;
    }

    public int getStatus() {
        return this.status;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUpdated_at() {
        return this.updated_at;
    }

    public int getView_time() {
        return this.view_time;
    }

    public boolean isIs_collect() {
        return this.is_collect;
    }

    public void setAuthError(AuthError paramAuthError) {
        this.authError = paramAuthError;
    }

    public void setCover_oss_filename(String paramString) {
        this.cover_oss_filename = paramString;
    }

    public void setCover_url(String paramString) {
        this.cover_url = paramString;
    }

    public void setCreated_at(String paramString) {
        this.created_at = paramString;
    }

    public void setDeleted_at(String paramString) {
        this.deleted_at = paramString;
    }

    public void setDuration(int paramInt) {
        this.duration = paramInt;
    }

    public void setId(Integer paramString) {
        this.id = paramString;
    }

    public void setIs_collect(boolean paramBoolean) {
        this.is_collect = paramBoolean;
    }

    public void setIs_vip(int paramInt) {
        this.is_vip = paramInt;
    }

    public void setOnline_time(String paramString) {
        this.online_time = paramString;
    }

    public void setPlay_count(int paramInt) {
        this.play_count = paramInt;
    }

    public void setPlay_url_m3u8(String paramString) {
        this.play_url_m3u8 = paramString;
    }

    public void setStatus(int paramInt) {
        this.status = paramInt;
    }

    public void setTitle(String paramString) {
        this.title = paramString;
    }

    public void setUpdated_at(String paramString) {
        this.updated_at = paramString;
    }

    public void setView_time(int paramInt) {
        this.view_time = paramInt;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }
}

