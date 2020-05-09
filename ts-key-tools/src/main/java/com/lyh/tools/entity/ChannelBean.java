package com.lyh.tools.entity;

import java.util.ArrayList;
import java.util.List;

public class ChannelBean extends BaseBean {
    public static final int LABEL_TYPE_NORMAL = 2;
    public static final int LABEL_TYPE_SELECTED = 3;
    public static final int LABEL_TYPE_TITLE = 1;
    public static final int LABEL_TYPE_UNSELECTED = 5;
    public static final int LABEL_TYPE_UNSELECTED_TITLE = 4;
    public static long time;
    public List<ChannalFixBean> fixTags = new ArrayList<>();
    public List<ChannalFixBean> mytags = new ArrayList<>();
    public List<ChannalFixBean> orther = new ArrayList<>();

    public class ChannalFixBean extends BaseBean {
        public String desc;
        public int fixid;
        public int game_id;
        public String icon;
        public int id;
        public String image;
        public String name;
        public String type;
        public int viewType;
    }
}
