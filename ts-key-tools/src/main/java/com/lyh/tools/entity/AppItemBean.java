package com.lyh.tools.entity;

public class AppItemBean extends BaseBean {
    public APP app;

    public class APP extends BaseBean {
        public String created_at;
        public String desc;
        public int downloads;
        public int id;
        public String logo;
        public String md5;
        public String name;
        public String package_file;
        public String package_name;
        public String package_url;
        public String size;
        public int sort;
        public String type;
        public String updated_at;
        public String version_name;
        public int version_num;

        public APP() {
        }
    }
}
