package com.onedream.android.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Administrator on 2017/3/20 0020.
 */

public class Crime {
    private UUID mUUID;
    private String mTitle;
    private Date mCrimeDate;
    private boolean mSolved;

    public Crime(){
        mUUID = UUID.randomUUID();
        mCrimeDate = new Date();
    }

    public UUID getUUID() {
        return mUUID;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mCrimeDate;
    }

    public void setDate(Date date) {
        mCrimeDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}
