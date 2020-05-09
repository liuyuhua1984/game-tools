package com.lyh.tools.entity;

/**
 * @author lyh
 * @CLASSNAME VideoTypeInfo
 * @description 视频类型
 * @date 2019/11/8
 **/
public class VideoTypeInfo {

    private String cover_oss_filename;

    private String cover_url;

    private String created_at;

    private String deleted_at;

    private int duration;

    private String id;


    private int is_vip;

    private String online_time;

    private int play_count;



    private String title;

    private String updated_at;

    private int view_time;
    private int coin;


    public String getCover_oss_filename() {
        return cover_oss_filename;
    }

    public void setCover_oss_filename(String cover_oss_filename) {
        this.cover_oss_filename = cover_oss_filename;
    }

    public String getCover_url() {
        return cover_url;
    }

    public void setCover_url(String cover_url) {
        this.cover_url = cover_url;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getDeleted_at() {
        return deleted_at;
    }

    public void setDeleted_at(String deleted_at) {
        this.deleted_at = deleted_at;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getIs_vip() {
        return is_vip;
    }

    public void setIs_vip(int is_vip) {
        this.is_vip = is_vip;
    }

    public String getOnline_time() {
        return online_time;
    }

    public void setOnline_time(String online_time) {
        this.online_time = online_time;
    }

    public int getPlay_count() {
        return play_count;
    }

    public void setPlay_count(int play_count) {
        this.play_count = play_count;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public int getView_time() {
        return view_time;
    }

    public void setView_time(int view_time) {
        this.view_time = view_time;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }
}
