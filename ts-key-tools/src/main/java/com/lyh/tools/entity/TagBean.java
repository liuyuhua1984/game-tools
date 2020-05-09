package com.lyh.tools.entity;


import java.util.List;
import java.util.Random;


public class TagBean extends BaseBean {
    public List<Tag> fixTags;
    public List<Tag> mytags;
    public List<Tag> tags;
    public long time;

    public class Tag extends BaseBean {
        public int cate_id;
        public boolean checked;
        public String created_at;
        public String desc;
        public int game_id;
        public int hot;
        public int hot_plus;
        public String icon;
        public int id;
        public String image;
        public int maegin = new Random().nextInt(100000);
        public String name;
        public int sort;
        public String status;
        public String fixid;
        public List<Tag> tags;
        public String type;
        public String type_id;
        public String updated_at;
        public int viewType;
    }
}
