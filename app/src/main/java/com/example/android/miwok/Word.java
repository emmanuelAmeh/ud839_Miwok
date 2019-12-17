package com.example.android.miwok;

import java.util.ArrayList;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId;

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
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

    /*private String miwokWord;
    private String englishWord;

    public Word() {
        englishWord = this.englishWord;
        miwokWord = this.miwokWord;
    }

    public Word (String miwok, String english){
        wordsInMiwok.add(miwok);
        wordsInEnglish.add(english);
    }

    ArrayList<String> wordsInEnglish = new ArrayList<>();

    ArrayList<String> wordsInMiwok = new ArrayList<>();

    public String getEnglishWord(String miwokWord) {
        int index = wordsInMiwok.indexOf(miwokWord);
        return wordsInEnglish.get(index);
    }

    public String getMiwokWord(String englishWord){
        int index = wordsInEnglish.indexOf(englishWord);
        return wordsInMiwok.get(index);
    }*/

}
