package com.example.fantasymapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {
    int numberOfTabs;
    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.numberOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                PrimeiroFragment tab1 = new PrimeiroFragment();
                return tab1;
            case 1:
                SegundoFragment tab2 = new SegundoFragment();
                return tab2;
            case 2:
                TerceiroFragment tab3 = new TerceiroFragment();
                return tab3;
            case 3:
                QuartoFragment tab4 =new QuartoFragment();
                return tab4;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}