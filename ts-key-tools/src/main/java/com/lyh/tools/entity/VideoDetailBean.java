package com.lyh.tools.entity;


import java.util.List;

public class VideoDetailBean extends BaseBean {

    public int comments_num;
    public int game_switch;
    public List<VideoBean> guess;
    public Movie movie;

    public List<VideoBean> similar;
    public List<TagBean.Tag> tags_random;


    public int getCommentsNum() {
        return this.comments_num;
    }
}
