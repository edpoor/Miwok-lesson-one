package com.example.android.miwok;

class Word {

    private String mDefaultTranslation; // i.e., English
    private String mMiwokTranslation;
    private int mImageResourceId;    // points to a picture of the Miwork word, lik. 3 acorns for the number three
    private int mSoundResourceId;   // raw MP3 file

    public Word(String defaultTranslation, String miwokTranslation) {

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int soundResourceId) {

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mSoundResourceId = soundResourceId;
    }

    void setSoundResource(int id) {
        mSoundResourceId = id;
    }

    int getSoundResourceId() {
        return mSoundResourceId;
    }

    String getMiwokTerm() {
        return mMiwokTranslation;
    }

    String getDefaultTerm() {
        return mDefaultTranslation;
    }

    int getImageResourceId() {

        return mImageResourceId;
    }

    boolean hasImageResource() {

        return mImageResourceId != 0;
    }
}