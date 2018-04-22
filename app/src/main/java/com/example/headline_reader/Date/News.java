package com.example.headline_reader.Date;

/**
 * Created by Taurus on 2018/4/22.
 * 新闻信息得存储类
 */

public class News {
    private String imageUrl;
    private String newsTitle;
    private String newsResouce;
    private String updateTime;
    private String newsType;
    private String newsContentType;
    private String newsContent;

    public News() {

    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String mImageUrl) {
        this.imageUrl = mImageUrl;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsResouce() {
        return newsResouce;
    }

    public void setNewsResouce(String newsResouce) {
        this.newsResouce = newsResouce;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getNewsType() {
        return newsType;
    }

    public void setNewsType(String newsType) {
        this.newsType = newsType;
    }

    public String getNewsContentType() {
        return newsContentType;
    }

    public void setNewsContentType(String newsContentType) {
        this.newsContentType = newsContentType;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }
}
