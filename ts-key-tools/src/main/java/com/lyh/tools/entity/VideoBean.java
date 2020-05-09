package com.lyh.tools.entity;

import java.io.Serializable;
import java.util.List;

public class VideoBean implements Serializable {
    public String actor;
    public String country;
    public String created_at;
    public String description;
    public String fititle;
    public String heat;
    public String horizontal_cover;
    public int id;
    public String img_path;
    public int like_ratio;
    public String movie_length;
    public String num;
    public String number;
    public PivotBean pivot;
    public String preview_pics;
    public String producer;
    public String publish_time;
    public String published_at;
    public int shooting_type;
    public int sort;
    public int status;
    public int subtitle_type;
    public List<String> tag_names;
    public String time_length;
    public String title;
    public String updated_at;
    public String url;
    public String vertical_cover;
    public String video_id;
    public String video_name;
    public int video_type;
    public int views;

    public class PivotBean implements Serializable {
        public int uid;
        public int video_id;
        public int watch_time;
    }
}
