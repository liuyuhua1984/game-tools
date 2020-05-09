package com.lyh.tools.entity;

import java.util.List;

public class TaskListBean extends BaseBean {
    public String activity_switch;
    public String activity_title;
    public String invitation_list_link;
    public List<Task> tasks;
    public TaskList tasks_map;

    public class ItemReward extends BaseBean {
        public String created_at;
        public String desc;
        public int id;
        public String item_id;
        public String item_name_num_text;
        public String item_num;
        public List<Items> items;
        public Object json;
        public String name;
        public int state;
        public String updated_at;
    }

    public class Items extends BaseBean {
        public String icon;
        public int id;
        public String key;
        public String name;
        public String num;
    }

    public class Task extends BaseBean {
        public int cache_times;
        public String cache_type;
        public String condition;
        public String created_at;
        public boolean finish_status;
        public int id;
        public String img;
        public int integral;
        public ItemReward item_reward;
        public String key;
        public int limit;
        public String log_date;
        public String name;
        public String remark;
        public boolean reward_status;
        public String status;
        public String type;
        public String updated_at;
        public int views_times;
        public String views_type;
    }

    public class TaskList extends BaseBean {
        public List<Task> type1;
        public List<Task> type2;
        public List<Task> type3;
        public List<Task> type4;
    }
}
