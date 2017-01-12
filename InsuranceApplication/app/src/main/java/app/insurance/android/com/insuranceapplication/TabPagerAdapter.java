package app.insurance.android.com.insuranceapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by sriramk on 1/10/17.
 */

public class TabPagerAdapter extends FragmentStatePagerAdapter {
    int mNumberOfTabs;

    public TabPagerAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.mNumberOfTabs = numberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                ViewPolicies tf1 = new ViewPolicies();
                return tf1;
            case 1:
                AddNewPolicy tf2 = new AddNewPolicy();
                return tf2;
            case 2:
                UpdatePolicy tf3 = new UpdatePolicy();
                return tf3;
            case 3:
                RemovePolicy tf4 = new RemovePolicy();
                return tf4;
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return mNumberOfTabs;
    }
}
