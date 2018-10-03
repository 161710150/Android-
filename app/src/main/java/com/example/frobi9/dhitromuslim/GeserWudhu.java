package com.example.frobi9.dhitromuslim;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

public class GeserWudhu extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geser_wudhu);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));


    }


    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    Langkah1 tabItem1 = new Langkah1();
                    return tabItem1;
                case 1:
                    Langkah2 tabItem2 = new Langkah2();
                    return tabItem2;
                case 2:
                    Langkah3 tabItem3 = new Langkah3();
                    return tabItem3;
                case 3:
                    Langkah4 tabItem4 = new Langkah4();
                    return tabItem4;
                case 4:
                    Langkah5 tabItem5 = new Langkah5();
                    return tabItem5;
                case 5:
                    Langkah6 tabItem6 = new Langkah6();
                    return tabItem6;
                case 6:
                    Langkah7 tabItem7 = new Langkah7();
                    return tabItem7;
                case 7:
                    Langkah8 tabItem8 = new Langkah8();
                    return tabItem8;
                case 8:
                    Langkah9 tabItem9 = new Langkah9();
                    return tabItem9;
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return 9;
        }
        @Override
        public CharSequence getPageTitle(int position){
            switch (position){
                case 0:
                    return "Langkah1";
                case 1:
                    return "Langkah2";
                case 2:
                    return "Langkah3";
                case 3:
                    return "Langkah4";
                case 4:
                    return "Langkah5";
                case 5:
                    return "Langkah6";
                case 6:
                    return "Langkah7";
                case 7:
                    return "Langkah8";
                case 8:
                    return "Langkah9";
            }return null;
        }
    }
}
