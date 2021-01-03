package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ViewPager vp =  findViewById(R.id.v1);
        TabLayout tl  = findViewById(R.id.t1);
        tl.setupWithViewPager(vp);
        FragmentAdaper   FragmentAdapter =  new FragmentAdaper (getSupportFragmentManager());
        vp.setAdapter(FragmentAdapter );

        tl.getTabAt(0).setIcon(R.drawable.ic_baseline_headset_24);
        tl.getTabAt(1).setIcon(R.drawable.ic_baseline_insert_photo_24);
        tl.getTabAt(2).setIcon(R.drawable.ic_baseline_tv_24);
        tl.getTabAt(3).setIcon(R.drawable.ic_baseline_stay_primary_portrait_24);



    }
}