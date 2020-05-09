package com.lyh.tools.entity;


import com.alibaba.fastjson.annotation.JSONField;

import java.util.ArrayList;
import java.util.List;

public class SubjectBean extends BaseBean {
    @JSONField(name="is_flow_open")
    public int isFlowOpen;
    public List<Subject> monographic = new ArrayList<>();
    public int more;
    public List<Subject> specials;
    public long time;




}
