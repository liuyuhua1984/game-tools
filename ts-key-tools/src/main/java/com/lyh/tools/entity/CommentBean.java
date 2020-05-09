package com.lyh.tools.entity;

import java.util.LinkedList;

public class CommentBean extends BaseBean {
    public int is_open;
    public int more;
    public LinkedList<Comment> result;
    public Integer total;

    public class Comment extends BaseBean {
        public String avatar;
        public String content;
        public String created_at;
        public long id;
        public int is_liked;
        public int like_count;
        public String nickname;
        public String status;
        public String updated_at;
        public int user_id;
        public String video_id;

        public Comment() {
        }

        public String getAvatar() {
            return this.avatar;
        }

        public String getContent() {
            return this.content;
        }

        public String getCreatedAt() {
            return this.created_at;
        }

        public long getId() {
            return this.id;
        }

        public String getNickName() {
            return this.nickname;
        }

        public String getStatus() {
            return this.status;
        }

        public String getUpdatedAt() {
            return this.updated_at;
        }

        public int getUserId() {
            return this.user_id;
        }

        public String getVideoId() {
            return this.video_id;
        }

        public void setAvatar(String str) {
            this.avatar = str;
        }
    }
}
