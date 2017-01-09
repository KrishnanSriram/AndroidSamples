package ndrawer.sample.android.com.simplenavigationdrawer;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by sriramk on 1/9/17.
 */

public class DrawerItemCustomAdapter extends ArrayAdapter<DataModel> {
    Context mContext;
    int mLayoutResourceId;
    DataModel mData[] = null;

    public DrawerItemCustomAdapter(Context context, int layoutResourceId, DataModel[] data) {
        super(context, layoutResourceId, data);
        mContext = context;
        mLayoutResourceId = layoutResourceId;
        mData = data;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItem = convertView;
        LayoutInflater inflator = ((Activity)mContext).getLayoutInflater();
        listItem = inflator.inflate(mLayoutResourceId, parent, false);
        ImageView imageView = (ImageView)listItem.findViewById(R.id.image_view_icon);
        TextView textView = (TextView)listItem.findViewById(R.id.text_view_name);
        DataModel folder = mData[position];
        imageView.setImageResource(folder.getIcon());
        textView.setText(folder.getName());

        return listItem;
    }
}
