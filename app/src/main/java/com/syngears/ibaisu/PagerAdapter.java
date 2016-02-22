package com.syngears.ibaisu;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                Fragment tab1 = new HomeFragmentTabHome();
                return tab1;

            case 1:
                Fragment tab2 = new HomeFragmentTabMessage();
                return tab2;

            default:
                Fragment tabnull = null;
                return tabnull;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}