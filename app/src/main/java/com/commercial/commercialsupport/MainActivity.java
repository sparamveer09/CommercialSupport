package com.commercial.commercialsupport;

import android.database.sqlite.SQLiteDatabase;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    SQLiteDatabase sqLiteDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CommercialDatabaseOnboardingFragment fragment = new CommercialDatabaseOnboardingFragment();
        fragment.show(getSupportFragmentManager(), null);

        ViewPager viewPager = findViewById(R.id.onboarding_viewpager);
        viewPager.setAdapter(new OnboardingViewPagerAdapter(getSupportFragmentManager()));
        sqLiteDatabase = SQLiteDatabase.openOrCreateDatabase()
    }




    private static class OnboardingViewPagerAdapter extends FragmentPagerAdapter {

        OnboardingViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return 1;
        }

        @Override
        public Fragment getItem(int position) {
            return CommercialDatabaseOnboardingFragment.newInstance();
        }
    }
}
