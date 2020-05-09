package com.lyh.tools.entity;


import java.io.Serializable;

public class HistoryVideo extends VideoInfo implements Serializable {
    private boolean isCheck;

    public boolean isChecked() {
        return this.isCheck;
    }

    public void setChecked(boolean paramBoolean) {
        this.isCheck = paramBoolean;
    }

    public void toggle() {
        this.isCheck ^= true;
    }
}


