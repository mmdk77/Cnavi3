package com.sds.study.cnavi3;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by seon on 2016-11-29.
 */

public class CnaviViewPagerAdapter extends FragmentStatePagerAdapter {

    Fragment[] fragments = new Fragment[2];

    public CnaviViewPagerAdapter(FragmentManager fm) {
        super(fm);
        fragments[0] = new LoginFragment();
        fragments[1]= new RegistFragment();
    }

    @Override
    public Fragment getItem(int position) {
        return fragments[position];
    }

    @Override
    public int getCount() {
        return fragments.length;
    }
}
