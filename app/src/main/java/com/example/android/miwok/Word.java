package com.example.android.miwok;

import android.media.MediaPlayer;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId;
    private int mAudioResourceId;
    public Word (String DefaultTranslation, String MiwokTranslation, int audioResourceId) {
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation =  MiwokTranslation;
        mAudioResourceId = audioResourceId;
    }
    public Word (String DefaultTranslation, String MiwokTranslation, int ImageResourceId, int audioResourceId) {
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation =  MiwokTranslation;
        mImageResourceId = ImageResourceId;
        mAudioResourceId = audioResourceId;
    }
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;

    }
}
