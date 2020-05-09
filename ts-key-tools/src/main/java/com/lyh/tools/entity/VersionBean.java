package com.lyh.tools.entity;


public class VersionBean extends BaseBean {
    public Version basic;

    public class Version extends BaseBean {
        public String app_key;
        public String created_at;
        public String desc;
        public String filesize;
        public int id;
        public boolean isGetNotice;
        public int serial_number;
        public String status;
        public int terminal;
        public String updated_at;
        public String url;
        public int user_id;
        public String version;
    }
}
