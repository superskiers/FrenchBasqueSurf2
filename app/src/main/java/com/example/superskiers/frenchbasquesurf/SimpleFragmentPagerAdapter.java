package com.example.superskiers.frenchbasquesurf;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {


    private final Context mContext;

    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new SwellFragment();
            case 1:
                return new WindFragment();
            case 2:
                return new TidesFragment();
            default:
                return new ForecastFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.category_swell);
            case 1:
                return mContext.getString(R.string.category_wind);
            case 2:
                return mContext.getString(R.string.category_tides);
            default:
                return mContext.getString(R.string.category_forecast);

        }

    }
}