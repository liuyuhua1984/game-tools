package com.lyh.tools.entity;


import com.lyh.tools.entity.search.Tag;

import java.util.ArrayList;
import java.util.List;

/**
 * 标题数据
 *
 * @author: root
 * @create: 2019-01-25 12:06
 **/

public class TitleData {

    /**视频名称**/
    private String title ="";

    /**m3u8名称**/
    private String fileName="";

    /**图片**/
    private String imgName="";

    /**视频描术**/
    private String description;

    /**播放时常**/
    private String movieLength;

    /**热度**/
    private long heat;

    /**番号**/
    private String number;
    /**制作人**/
    private String producer;
    /**出版时间**/
    private String publishTime;
    /**sp创建时间**/
    private String createdAt;
    /**sp更新时间**/
    private String updatedAt;

    /**播放次数**/
    private long views;


    private Actor actor;

    private int id;

    private List<Tag> tags = new ArrayList<Tag>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

//    /**
//    * 标签
//     *功能描述
//     * @author lyh
//     * @date
//     * @param  * @param null
//     * @return
//     */
//    public static class Tag{
//        private int id;
//        private String name;
//
//        public int getId() {
//            return id;
//        }
//
//        public void setId(int id) {
//            this.id = id;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMovieLength() {
        return movieLength;
    }

    public void setMovieLength(String movieLength) {
        this.movieLength = movieLength;
    }

    public long getHeat() {
        return heat;
    }

    public void setHeat(long heat) {
        this.heat = heat;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public long getViews() {
        return views;
    }

    public void setViews(long views) {
        this.views = views;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public static class Actor{
        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getChineseName() {
            return chineseName;
        }

        public void setChineseName(String chineseName) {
            this.chineseName = chineseName;
        }

        public String getJpName() {
            return jpName;
        }

        public void setJpName(String jpName) {
            this.jpName = jpName;
        }

        public String getEnglishName() {
            return englishName;
        }

        public void setEnglishName(String englishName) {
            this.englishName = englishName;
        }

        private long id;
        private String chineseName;
        private String jpName;
        private String englishName;

    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

