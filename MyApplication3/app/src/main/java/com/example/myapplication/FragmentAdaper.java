package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import Fragments.BlankFragment;
import Fragments.BlankFragment2;
import Fragments.BlankFragment3;
import Fragments.BlankFragment4;

public class FragmentAdaper extends FragmentPagerAdapter {
    public FragmentAdaper(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

            switch (position){
                case 0:
                    return new BlankFragment();
                case 1 :
                    return new BlankFragment2();
                case 2 :
                    return new BlankFragment3();
                case 3 :
                    return new BlankFragment4();

            }
            return null;
        }

    @Override
    public int getCount() {
        return 4;
    }
}
