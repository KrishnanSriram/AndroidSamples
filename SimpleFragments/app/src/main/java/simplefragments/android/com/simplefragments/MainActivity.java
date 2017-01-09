package simplefragments.android.com.simplefragments;

import android.support.v4.app.Fragment;

import layout.CrimeFragment;

public class MainActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}
