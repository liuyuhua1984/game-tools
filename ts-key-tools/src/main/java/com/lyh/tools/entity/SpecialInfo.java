package com.lyh.tools.entity;

/**
 * @author lyh
 * @CLASSNAME SpecialInfo
 * @description 特殊列表数据
 * @date 2019/11/8
 **/
public class SpecialInfo {
    private int id;

    private String title;

    private String cover_oss_filename;

    private String intro;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCover_oss_filename() {
        return cover_oss_filename;
    }

    public void setCover_oss_filename(String cover_oss_filename) {
        this.cover_oss_filename = cover_oss_filename;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }
}
