package com.lyh.tools.entity.search;


import com.alibaba.fastjson.annotation.JSONField;
import com.lyh.tools.entity.BaseBean;

import java.util.List;

public class TagData extends BaseBean {
    public List<TagAttr> info;

    public class TagAttr {
        public int id;
        public String name;
        @JSONField(name="list")
        public List<Tag> tags;
    }
}
