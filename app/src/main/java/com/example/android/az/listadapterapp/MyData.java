package com.example.android.az.listadapterapp;

//TODO 4 create main class for represnt the data

public class MyData {
    private String mCode;
    private String mName;
    private String mBirthdate;

    public MyData(String mCode, String mName, String mBirthdate) {
        this.mCode = mCode;
        this.mName = mName;
        this.mBirthdate = mBirthdate;
    }

    public String getmCode() {
        return mCode;
    }

    public String getmName() {
        return mName;
    }

    public String getmBirthdate() {
        return mBirthdate;
    }
}
