package com.lyh.tools.entity;


import com.alibaba.fastjson.annotation.JSONField;

import java.util.ArrayList;
import java.util.List;

public class VideosDataBean extends BaseBean {
    @JSONField(name="index_video_flow_switch")
    public String indexVideoFlowSwitch;
    public int more;

    public List<Subject> specials;
    public String step;
    @JSONField(name="step_next")
    public int stepNext;
    public int total;
    public List<VideoBean> video;
    public List<VideoBean> videos = new ArrayList<>();
}
