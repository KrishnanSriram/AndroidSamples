package tabapp.simple.android.com.simpletabbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
/*
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
                TabFragment1 tf1 = new TabFragment1();
                return tf1;
            case 1:
                TabFragment2 tf2 = new TabFragment2();
                return tf2;
            case 2:
                TabFragment3 tf3 = new TabFragment3();
                return tf3;
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return mNumberOfTabs;
    }
}
