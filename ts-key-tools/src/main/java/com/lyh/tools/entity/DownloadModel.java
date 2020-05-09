package com.lyh.tools.entity;


public class DownloadModel {
    public static final int STATUS_COMPLETE = 5;
    public static final int STATUS_DOWNLOADING = 3;
    public static final int STATUS_DOWNLOAD_ERROR = 4;
    public static final int STATUS_PAUSED = 0;
    public static final int STATUS_START = 2;
    public static final int STATUS_WAITING = 1;
    private String directory = "";
    private int downloadCount;
    private int downloadStatus;
    private String filename = "";
    private long id;
    private String localUrl = "";
    private long operatingTime;
    private int progress;
    private int retryCount;
    private int speed;
    private long startTime;
    private int totalNum;
    private String url = "";
    private String videoId = "";
    private String videoImage = "";
    private String videoName = "";
    private String videoTime = "";

    public DownloadModel() {
    }

    public DownloadModel(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, int i3, String str8, int i4, long j2, long j3) {
        this.id = j;
        this.directory = str;
        this.videoName = str2;
        this.videoImage = str3;
        this.videoTime = str4;
        this.videoId = str5;
        this.url = str6;
        this.localUrl = str7;
        this.progress = i;
        this.totalNum = i2;
        this.downloadCount = i3;
        this.filename = str8;
        this.downloadStatus = i4;
        this.operatingTime = j2;
        this.startTime = j3;
    }

    public String getDirectory() {
        return this.directory;
    }

    public int getDownloadCount() {
        return this.downloadCount;
    }

    public int getDownloadStatus() {
        return this.downloadStatus;
    }

    public String getFilename() {
        return this.filename;
    }

    public long getId() {
        return this.id;
    }

    public String getLocalUrl() {
        return this.localUrl;
    }



    public long getOperatingTime() {
        return this.operatingTime;
    }

    public int getProgress() {
        return this.progress;
    }

    public int getRetryCount() {
        return this.retryCount;
    }

    public int getSpeed() {
        return this.speed;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public int getTotalNum() {
        return this.totalNum;
    }

    public String getUrl() {
        return this.url;
    }

    public String getVideoId() {
        return this.videoId;
    }

    public String getVideoImage() {
        return this.videoImage;
    }

    public String getVideoName() {
        return this.videoName;
    }

    public String getVideoTime() {
        return this.videoTime;
    }

    public void setDirectory(String str) {
        this.directory = str;
    }

    public void setDownloadCount(int i) {
        this.downloadCount = i;
    }

    public void setDownloadStatus(int i) {
        this.downloadStatus = i;
    }

    public void setFilename(String str) {
        this.filename = str;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setLocalUrl(String str) {
        this.localUrl = str;
    }



    public void setOperatingTime(long j) {
        this.operatingTime = j;
    }

    public void setProgress(int i) {
        this.progress = i;
    }

    public void setRetryCount(int i) {
        this.retryCount = i;
    }

    public void setSpeed(int i) {
        this.speed = i;
    }

    public void setStartTime(long j) {
        this.startTime = j;
    }

    public void setTotalNum(int i) {
        this.totalNum = i;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setVideoId(String str) {
        this.videoId = str;
    }

    public void setVideoImage(String str) {
        this.videoImage = str;
    }

    public void setVideoName(String str) {
        this.videoName = str;
    }

    public void setVideoTime(String str) {
        this.videoTime = str;
    }


}
