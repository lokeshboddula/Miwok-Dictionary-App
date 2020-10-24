package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranlation;

    public Word (String DefaultTranslation, String MiwokTranlation) {
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranlation =  MiwokTranlation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranlaton() {
        return mMiwokTranlation;
    }
}
