package app.insurance.android.com.insuranceapplication;

/**
 * Created by sriramk on 1/12/17.
 */

public class PolicyInformationModel {
    private int mIcon;
    private String mTitle;
    private String mCounter;

    private boolean mIsGroupHeader = false;

    public PolicyInformationModel(int icon, String title, String counter) {
        mIcon = icon;
        mTitle = title;
        mCounter = counter;
    }

    public PolicyInformationModel(int icon, String title, String counter, boolean isGroupHeader) {
        mIcon = icon;
        mTitle = title;
        mCounter = counter;
        mIsGroupHeader = isGroupHeader;
    }

    public PolicyInformationModel(String title) {
        mTitle = title;
        mIsGroupHeader = true;
    }

    public boolean isGroupHeader() {
        return mIsGroupHeader;
    }

    public int getIcon() {
        return mIcon;
    }

    public String getTitle() {

        return mTitle;
    }

    public String getCounter() {
        if(mIsGroupHeader) {
            return "0";
        }
        return mCounter;
    }

    public void setGroupHeader(boolean groupHeader) {
        mIsGroupHeader = groupHeader;
    }
}
