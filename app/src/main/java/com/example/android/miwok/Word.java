package com.example.android.miwok;

/**
 * Created by prashant on 2/16/2017.
 */

public class Word {
    private String english =null;
    private String miwok =null;


    public Word(String text1,String text2){
        english = text1;
        miwok=text2;
    }
    public String getEnglish(){
        return english;
    }
    public String getMiwok(){
        return miwok;
    }
}
