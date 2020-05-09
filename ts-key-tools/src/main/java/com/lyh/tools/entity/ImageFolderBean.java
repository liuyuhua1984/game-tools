package com.lyh.tools.entity;

import java.util.ArrayList;

public class ImageFolderBean {
    private String albumPath;
    private ArrayList<ImageBean> images = new ArrayList<>();
    private String name;
    private String path;

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ImageFolderBean)) {
            return false;
        }
        ImageFolderBean imageFolderBean = (ImageFolderBean) obj;
        if (imageFolderBean.getPath() != null || this.path == null) {
            return imageFolderBean.getPath().toLowerCase().equals(this.path.toLowerCase());
        }
        return false;
    }

    public String getAlbumPath() {
        return this.albumPath;
    }

    public ArrayList<ImageBean> getImages() {
        return this.images;
    }

    public String getName() {
        return this.name;
    }

    public String getPath() {
        return this.path;
    }

    public void setAlbumPath(String str) {
        this.albumPath = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPath(String str) {
        this.path = str;
    }
}
