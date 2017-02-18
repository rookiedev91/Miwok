package com.example.android.miwok;

/**
 * Created by prashant on 2/16/2017.
 */

public class Word {
    private String english;
    private String miwok;
    private static final int NoImage=-1;
    private int image=NoImage;
    private int audio=0;

    public Word(String text1, String text2, int music){
        english = text1;
        miwok=text2;
        audio=music;
    }
    public Word(String text1,String text2,int icon,int music){
        english=text1;
        miwok=text2;
        image=icon;
        audio=music;
    }
    public String getEnglish(){
        return english;
    }
    public String getMiwok(){
        return miwok;
    }
    public int getImage(){return image;}
    public boolean hasImage(){
        return image!=NoImage;
    }
    public int getAudio(){return audio;}
}
