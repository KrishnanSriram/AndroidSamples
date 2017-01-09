package simplefragments.android.com.simplefragments;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by sriramk on 12/31/16.
 */

public class CrimeLab {
    private static CrimeLab sCrimeLab;
    private List<Crime> mCrimes;

    public static CrimeLab get(Context context) {
        if(sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }

        return sCrimeLab;
    }

    public List<Crime> getCrimes() {
        return mCrimes;
    }

    public Crime getCrime(UUID id) {
        for(Crime crime: mCrimes) {
            if(crime.getId().equals(id)) {
                return crime;
            }
        }

        return null;
    }

    private CrimeLab(Context context) {
        mCrimes = new ArrayList<>();

        for(int index = 0;index<100; index++) {
            Crime crime = new Crime();
            crime.setTitle("Crime #" + index);
            crime.setSolved(index%2 == 0);
            mCrimes.add(crime);
        }
    }
}
