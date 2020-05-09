package com.lyh.tools.entity;


import com.alibaba.fastjson.annotation.JSONField;

public class IndexAdVideoBean extends BaseBean implements BaseAdBean {
    @JSONField(name="blank_type")
    public String blankType;
    @JSONField(name="cdn_number")
    public int cdnNumber;
    public String flag;
    public int id;
    @JSONField(name="img_path")
    public String imgPath;
    @JSONField(name="is_default")
    public String isDefault;
    @JSONField(name="movie_length")
    public String movieLength;
    public String name;
    @JSONField(name="preview_pics")
    public String previewPics;
    @JSONField(name="self_type")
    public String selfType;
    @JSONField(name="self_value")
    public String selfValue;
    public String target;
    public String text;
    public String url;
    @JSONField(name="video_name")
    public String videoName;

    public int getAdBlankType() {
        String str = this.blankType;
        if (str == null) {
            return 0;
        }
        return Integer.parseInt(str);
    }

    public int getAdId() {
        return this.id;
    }

    public String getAdName() {
        return this.name;
    }

    public int getAdSelfType() {
        String str = this.selfType;
        if (str == null) {
            return 0;
        }
        return Integer.parseInt(str);
    }

    public String getAdSelfValue() {
        return this.selfValue;
    }

    public String getAdTarget() {
        return this.target;
    }

    public String getAdUrl() {
        return this.url;
    }
}
