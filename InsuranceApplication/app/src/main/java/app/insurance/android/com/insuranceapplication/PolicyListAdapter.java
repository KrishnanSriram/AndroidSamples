package app.insurance.android.com.insuranceapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sriramk on 1/12/17.
 */

public class PolicyListAdapter extends ArrayAdapter<PolicyInformationModel> {

    private final Context mContext;
    private final ArrayList<PolicyInformationModel> mModelsArrayList;

    public PolicyListAdapter(Context context, ArrayList<PolicyInformationModel> modelsArrayList) {
        super(context, R.layout.policy_list_item);
        this.mContext = context;
        this.mModelsArrayList  = modelsArrayList;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // 1. Create inflater
        LayoutInflater inflater = (LayoutInflater)mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // 2. Get rowView from inflater
        View rowView = null;
        if(!mModelsArrayList.get(position).isGroupHeader()){
            rowView = inflater.inflate(R.layout.policy_list_item, parent, false);

            // 3. Get icon,title & counter views from the rowView
            ImageView imgView = (ImageView) rowView.findViewById(R.id.item_icon);
            TextView titleView = (TextView) rowView.findViewById(R.id.item_title);
            TextView counterView = (TextView) rowView.findViewById(R.id.item_counter);

            // 4. Set the text for textView
            imgView.setImageResource(mModelsArrayList.get(position).getIcon());
            titleView.setText(mModelsArrayList.get(position).getTitle());
            counterView.setText(mModelsArrayList.get(position).getCounter());
        } else {
            rowView = inflater.inflate(R.layout.policy_list_item_header, parent, false);
            TextView titleView = (TextView) rowView.findViewById(R.id.header);
            titleView.setText(mModelsArrayList.get(position).getTitle());

        }

        // 5. retrn rowView
        return rowView;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return mModelsArrayList.size();
    }

    @Override
    public PolicyInformationModel getItem(int arg0) {
        // TODO Auto-generated method stub
        return mModelsArrayList.get(arg0);
    }

    @Override
    public long getItemId(int arg0) {
        // TODO Auto-generated method stub
        return arg0;
    }
}
