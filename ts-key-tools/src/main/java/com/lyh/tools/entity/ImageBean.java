package com.lyh.tools.entity;

public class ImageBean {
    private long date;
    private String folderName;
    private int id;
    private boolean isSelect;
    private String name;
    private String path;
    private String thumbPath;

    public boolean equals(Object obj) {
        if (obj instanceof ImageBean) {
            return this.path.equals(((ImageBean) obj).getPath());
        }
        return false;
    }

    public long getDate() {
        return this.date;
    }

    public String getFolderName() {
        return this.folderName;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getPath() {
        return this.path;
    }

    public String getThumbPath() {
        return this.thumbPath;
    }

    public boolean isSelect() {
        return this.isSelect;
    }

    public void setDate(long j) {
        this.date = j;
    }

    public void setFolderName(String str) {
        this.folderName = str;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setSelect(boolean z) {
        this.isSelect = z;
    }

    public void setThumbPath(String str) {
        this.thumbPath = str;
    }
}
