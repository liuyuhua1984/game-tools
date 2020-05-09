package com.lyh.tools.entity;


import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

public class CommentRedPointStateBean implements Serializable {
    @JSONField(name="has_red_pot")
    private int hasRedPot;

    public int getHasRedPot() {
        return this.hasRedPot;
    }
}
