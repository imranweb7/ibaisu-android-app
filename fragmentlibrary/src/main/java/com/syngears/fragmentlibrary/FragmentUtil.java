package com.syngears.fragmentlibrary;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class FragmentUtil {
    public FragmentUtil() {
    }

    public void openFragment(FragmentManager fragmentManager, Fragment fragment, int fragment_container){
        FragmentTransaction fragmentTransaction = fragmentManager
                .beginTransaction();

        fragmentTransaction.replace(fragment_container, fragment);

        fragmentTransaction.commit();
    }
}
