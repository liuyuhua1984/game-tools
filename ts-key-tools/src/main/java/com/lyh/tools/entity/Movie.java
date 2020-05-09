package com.lyh.tools.entity;



import com.lyh.tools.entity.common.Actors;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class Movie implements Serializable {
    public String actor;
    public List<Actors> actors_brief;
    public LinkedList<String> attr;
    public String description;
    public int heat;
    public String horizontal_cover;
    public int id;
    public int like;
    public int like_ratio;
    public String movie_length;
    public String number;
    public String preview_pics;
    public String producer;
    public String publish_time;
    public int shooting_type;
    public int status;
    public int subtitle_type;
    public LinkedList<TagBean.Tag> tags;
    public String updated_at;
    public String url;
    public String url_secret;
    public String vertical_cover;
    public String video_id;
    public String video_name;
    public int video_type;
    public int views;

    public String created_at;

    public String getActor() {
        return this.actor;
    }

    public String getDescription() {
        return this.description;
    }

    public int getHeat() {
        return this.heat;
    }

    public String getHorizontalCover() {
        return this.horizontal_cover;
    }

    public int getId() {
        return this.id;
    }

    public String getMovieLength() {
        return this.movie_length;
    }

    public String getNumber() {
        return this.number;
    }

    public String getPreviewPics() {
        return this.preview_pics;
    }

    public String getProducer() {
        return this.producer;
    }

    public String getPublishTime() {
        return this.publish_time;
    }

    public int getShootingType() {
        return this.shooting_type;
    }

    public int getStatus() {
        return this.status;
    }

    public int getSubtitle_type() {
        return this.subtitle_type;
    }

    public String getUpdatedAt() {
        return this.updated_at;
    }

    public String getVerticalCover() {
        return this.vertical_cover;
    }

    public String getVideoId() {
        return this.video_id;
    }

    public String getVideoName() {
        return this.video_name;
    }

    public int getVideoType() {
        return this.video_type;
    }

    public String getVideoURL() {
        return this.url;
    }
}
