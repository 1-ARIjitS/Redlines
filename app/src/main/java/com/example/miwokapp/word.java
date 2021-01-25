package com.example.miwokapp;

import android.media.Image;
import android.widget.ImageView;

public class word
{
    public String mEnglishTranslation;
    public String mMiwokTranslation;
    public int mImageRes=DEFAULT;
    public int mMusicRaw;
    private static final int DEFAULT=-1;

    public word(String EnglishTranslation,String MiwokTranslation,int musicRaw)
    {
        mEnglishTranslation=EnglishTranslation;
        mMiwokTranslation=MiwokTranslation;
        mMusicRaw=musicRaw;
    }
    public word(String EnglishTranslation,String MiwokTranslation,int imageRes,int musicRaw )
    {
        mEnglishTranslation=EnglishTranslation;
        mMiwokTranslation=MiwokTranslation;
        mImageRes=imageRes;
        mMusicRaw=musicRaw;
    }

    public String getEnglishTranslation(){
        return mEnglishTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImage() { return mImageRes;}

    public int getMusic(){return mMusicRaw;}

    public boolean hasImage() {return mImageRes!=DEFAULT;}
}
