package com.lyh.tools.entity;

import java.io.Serializable;

public class RankingContentBean implements Serializable {
    private VideoBean video;

    public class VideoBean implements Serializable {
        private String flag;
        private int id;
        private String movie_length;
        private String preview_pics;
        private String video_name;
        private String views;

        public String getFlag() {
            return this.flag;
        }

        public int getId() {
            return this.id;
        }

        public String getMovieLength() {
            return this.movie_length;
        }

        public String getPreviewPics() {
            return this.preview_pics;
        }

        public String getVideoName() {
            return this.video_name;
        }

        public String getViews() {
            return this.views;
        }
    }

    public VideoBean getVideo() {
        return this.video;
    }
}
