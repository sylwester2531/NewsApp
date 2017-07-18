package com.example.android.newsapp;

import android.graphics.Bitmap;

/**
 * Created by admin on 2017-07-18.
 */
public class Article {

    private final String mTitle;
    private final String mWebUrl;
    private final String mSectionName;
    private String mTrailText = "";
    private Bitmap mThumbnail = null;

    Article(String title, String webUrl, String sectionName) {
        mTitle = title;
        mWebUrl = webUrl;
        mSectionName = sectionName;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getWebUrl() {
        return mWebUrl;
    }

    public String getSectionName() {
        return mSectionName;
    }

    public String getTrailText() {
        return mTrailText;
    }

    public void setTrailText(String trailText) {
        mTrailText = trailText;
    }

    public Bitmap getThumbnailBitmap() {
        return mThumbnail;
    }

    public void setThumbnailBitmap(Bitmap thumbnailBitmap) {
        mThumbnail = thumbnailBitmap;
    }
}
