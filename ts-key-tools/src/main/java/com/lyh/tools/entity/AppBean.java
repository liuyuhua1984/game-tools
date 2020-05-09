package com.lyh.tools.entity;

import java.util.List;

public class AppBean extends BaseBean {
    public List<APP> apps;

    public class APP extends BaseBean {
        public String created_at;
        public String desc;
        public int downloads;
        public int id;
        public int isChecked;
        public String logo;
        public String md5;
        public String name;
        public String package_file;
        public String package_name;
        public String package_url;
        public Reward reward;
        public String size;
        public String size_text;
        public int sort;
        public String text;
        public String type;
        public String updated_at;
        public String version_name;
        public int version_num;

        public class Reward extends BaseBean {
            public int downloads;
            public int integral;
            public int is_open;
            public int time_limit;
            public int views;

            public Reward() {
            }
        }

        public APP() {
        }
    }
}
