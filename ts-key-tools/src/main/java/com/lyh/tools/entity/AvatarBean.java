package com.lyh.tools.entity;

import java.util.List;

public class AvatarBean extends BaseBean {
    public List<Avatar> avatars;

    public class Avatar extends BaseBean {
        public String created_at;
        public int id;
        public String src;
        public int status;
        public String updated_at;
    }
}
