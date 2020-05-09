package com.lyh.tools.entity;

import java.io.Serializable;

public class Label implements Serializable {
    public static final int LABEL_TYPE_NORMAL = 2;
    public static final int LABEL_TYPE_SELECTED = 3;
    public static final int LABEL_TYPE_TITLE = 1;
    public static final int LABEL_TYPE_UNSELECTED = 5;
    public static final int LABEL_TYPE_UNSELECTED_TITLE = 4;
    public String detail;
    public int id;
    public String name;
    public String title;
    public int viewType;

    public Label() {
    }

    public Label(int i, String str) {
        this.id = i;
        this.name = str;
    }
}
