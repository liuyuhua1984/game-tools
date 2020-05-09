package com.lyh.tools.entity;

import java.io.Serializable;

public class DownloadApkModel implements Serializable {
    static final long serialVersionUID = 42;
    private boolean active;
    private String appName = "";
    private String desc = "";
    private long downloadSize;
    private DownloadStatus downloadStatus;
    private String fileName = "";
    private String fileSize;
    private String fileType;
    private int id;
    private String logoUrl = "";
    private String md5 = "";
    private String packageName = "";
    private int progress;
    private int retryCount;
    private String savePath = "";
    private int speed;
    private int taskid;
    private long time;
    private long totalSize;
    private UpdateType updateType;
    private String url = "";
    private String version = "";
    private int versionCode;

    public enum DownloadStatus {
        STATUS_NOT_START,
        STATUS_NOT_UPDATE,
        STATUS_START,
        STATUS_PENDING,
        STATUS_CONNECTING,
        STATUS_CONNECTTED,
        STATUS_CONNECT_ERROR,
        STATUS_DOWNLOADING,
        STATUS_PAUSED,
        STATUS_CANCELED,
        STATUS_DOWNLOAD_ERROR,
        STATUS_COMPLETE,
        STATUS_CHECKING,
        STATUS_CHECKING_ERROR,
        STATUS_CHECK_OK,
        STATUS_WAIT_INSTALL,
        STATUS_INSTALLING,
        STATUS_INSTALLED,
        STATUS_INSTALL_ERROR,
        STATUS_WAIT_UNINSTALL,
        STATUS_UNINSTALLING,
        STATUS_UNINSTALLED,
        STATUS_UNINSTALL_ERROR
    }

    public enum UpdateType {
        ForceUpdate,
        NotForceUpdate
    }

    public DownloadApkModel() {
    }

    public DownloadApkModel(int i, String str, String str2, String str3, String str4, String str5, int i2, long j, long j2, String str6, String str7, String str8, String str9, int i3, boolean z, String str10, String str11, int i4) {
        this.id = i;
        this.fileName = str;
        this.appName = str2;
        this.logoUrl = str3;
        this.packageName = str4;
        this.url = str5;
        this.progress = i2;
        this.downloadSize = j;
        this.totalSize = j2;
        this.savePath = str6;
        this.md5 = str7;
        this.version = str8;
        this.desc = str9;
        this.taskid = i3;
        this.active = z;
        this.fileSize = str10;
        this.fileType = str11;
        this.versionCode = i4;
    }

    public boolean getActive() {
        return this.active;
    }

    public String getAppName() {
        return this.appName;
    }

    public String getDesc() {
        return this.desc;
    }

    public long getDownloadSize() {
        return this.downloadSize;
    }

    public DownloadStatus getDownloadStatus() {
        return this.downloadStatus;
    }

    public String getFileName() {
        return this.fileName;
    }

    public String getFileSize() {
        return this.fileSize;
    }

    public String getFileType() {
        return this.fileType;
    }

    public int getId() {
        return this.id;
    }

    public String getLogoUrl() {
        return this.logoUrl;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public int getProgress() {
        return this.progress;
    }

    public int getRetryCount() {
        return this.retryCount;
    }

    public String getSavePath() {
        return this.savePath;
    }

    public int getSpeed() {
        return this.speed;
    }

    public int getTaskid() {
        return this.taskid;
    }

    public long getTime() {
        return this.time;
    }

    public long getTotalSize() {
        return this.totalSize;
    }

    public UpdateType getUpdateType() {
        return this.updateType;
    }

    public String getUrl() {
        return this.url;
    }

    public String getVersion() {
        return this.version;
    }

    public int getVersionCode() {
        return this.versionCode;
    }

    public boolean isActive() {
        return this.active;
    }

    public void setActive(boolean z) {
        this.active = z;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setDownloadSize(long j) {
        this.downloadSize = j;
    }

    public void setDownloadStatus(DownloadStatus downloadStatus2) {
        this.downloadStatus = downloadStatus2;
    }

    public void setFileName(String str) {
        this.fileName = str;
    }

    public void setFileSize(String str) {
        this.fileSize = str;
    }

    public void setFileType(String str) {
        this.fileType = str;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setLogoUrl(String str) {
        this.logoUrl = str;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setProgress(int i) {
        this.progress = i;
    }

    public void setRetryCount(int i) {
        this.retryCount = i;
    }

    public void setSavePath(String str) {
        this.savePath = str;
    }

    public void setSpeed(int i) {
        this.speed = i;
    }

    public void setTaskid(int i) {
        this.taskid = i;
    }

    public void setTime(long j) {
        this.time = j;
    }

    public void setTotalSize(long j) {
        this.totalSize = j;
    }

    public void setUpdateType(UpdateType updateType2) {
        this.updateType = updateType2;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public void setVersionCode(int i) {
        this.versionCode = i;
    }

    public String toString() {
        return "DownloadApkModel{id=" + this.id + ", fileName='" + this.fileName + '\'' + ", appName='" + this.appName + '\'' + ", logoUrl='" + this.logoUrl + '\'' + ", packageName='" + this.packageName + '\'' + ", url='" + this.url + '\'' + ", progress=" + this.progress + ", downloadSize=" + this.downloadSize + ", totalSize=" + this.totalSize + ", savePath='" + this.savePath + '\'' + ", md5='" + this.md5 + '\'' + ", version='" + this.version + '\'' + ", desc='" + this.desc + '\'' + ", taskid=" + this.taskid + ", active=" + this.active + ", fileSize='" + this.fileSize + '\'' + ", fileType='" + this.fileType + '\'' + ", versionCode=" + this.versionCode + ", speed=" + this.speed + ", time=" + this.time + ", retryCount=" + this.retryCount + ", downloadStatus=" + this.downloadStatus + ", updateType=" + this.updateType + '}';
    }
}
