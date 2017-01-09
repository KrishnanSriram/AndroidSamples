package simplefragments.android.com.simplefragments;

import android.support.v4.app.Fragment;

/**
 * Created by sriramk on 12/31/16.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
