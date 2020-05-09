package com.lyh.tools.entity;


import java.util.List;

public class  BootStrap extends BaseBean {
    public String appwebsite;
    public CDNBean cdns;
    public List<Domain> domains;
    public String expire_time;
    public String is_game_lobby_open;
    public int is_new_user;

    public String taskid;
    public long time;
    public String token;

    public class CDNBean extends BaseBean {
        public List<Domain> image;
        public List<Domain> video;
    }

}
