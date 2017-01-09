package ndrawer.sample.android.com.simplenavigationdrawer;

/**
 * Created by sriramk on 1/9/17.
 */

public class DataModel {
    private int mIcon;
    private String mName;

    public DataModel(int icon, String name) {
        mIcon = icon;
        this.mName = name;
    }

    public int getIcon() {
        return mIcon;
    }

    public void setIcon(int icon) {
        mIcon = icon;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }
}
