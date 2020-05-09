package com.lyh.tools.entity;


import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

public class MineComments extends BaseBean {
    @JSONField(name="info")
    public List<MineComment> comments;

    public class MineComment {
        private String content;
        private String created_at;
        private int id;
        private int like_count;
        private int point_num;
        private int report_count;
        private String review_time;
        private String video_id;
        private String video_name;

        public String getContent() {
            return this.content;
        }

        public String getCreated_at() {
            return this.created_at;
        }

        public int getId() {
            return this.id;
        }

        public int getLike_count() {
            return this.like_count;
        }

        public int getPoint_num() {
            return this.point_num;
        }

        public int getReport_count() {
            return this.report_count;
        }

        public String getReview_time() {
            return this.review_time;
        }

        public String getVideo_id() {
            return this.video_id;
        }

        public String getVideo_name() {
            return this.video_name;
        }

        public void setContent(String str) {
            this.content = str;
        }

        public void setCreated_at(String str) {
            this.created_at = str;
        }

        public void setId(int i) {
            this.id = i;
        }

        public void setLike_count(int i) {
            this.like_count = i;
        }

        public void setPoint_num(int i) {
            this.point_num = i;
        }

        public void setReport_count(int i) {
            this.report_count = i;
        }

        public void setReview_time(String str) {
            this.review_time = str;
        }

        public void setVideo_id(String str) {
            this.video_id = str;
        }

        public void setVideo_name(String str) {
            this.video_name = str;
        }
    }
}
