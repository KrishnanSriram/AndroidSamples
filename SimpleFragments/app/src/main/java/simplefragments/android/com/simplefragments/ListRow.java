package simplefragments.android.com.simplefragments;

/**
 * Created by sriramk on 12/31/16.
 */

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.ImageView;

public class ListRow extends RecyclerView.ViewHolder {
    public ImageView mThumbnail;

    public ListRow(View view) {
        super(view);
//        mThumbnail = (ImageView)view.findViewById(R.id.crime_recycler_view);
    }
}
