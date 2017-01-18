package activity.recycler.sample.com.agentlistactivity;

/**
 * Created by sriramk on 1/16/17.
 */

public class Agent {
    String mName;
    String mPhone;
    String mEmail;
    String mAddress;
    int mPhotoId;
    boolean isMyAgent;

    public Agent(String name, String phone, String email, int photoId) {
        this(name, phone, email, "", photoId, false);
    }

    public Agent(String name, String phone, String email, String address, int photoId, boolean myAgent) {
        mName = name;
        mPhone = phone;
        mEmail = email;
        mAddress = address;
        mPhotoId = photoId;
        isMyAgent = myAgent;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getPhone() {
        return mPhone;
    }

    public void setPhone(String phone) {
        mPhone = phone;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail = email;
    }

    public int getPhotoId() {
        return mPhotoId;
    }

    public void setPhotoId(int photoId) {
        mPhotoId = photoId;
    }

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String address) {
        mAddress = address;
    }
}
