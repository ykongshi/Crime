package com.onedream.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Administrator on 2017/3/21 0021.
 */

public class CrimeListActivity extends SingleFragmentActivity{

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }

}
