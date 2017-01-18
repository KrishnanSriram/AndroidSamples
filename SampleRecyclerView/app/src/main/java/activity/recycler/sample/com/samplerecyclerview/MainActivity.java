package activity.recycler.sample.com.samplerecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mPersonName;
    private TextView mPersonPhone;
    private ImageView mPersonImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPersonName = (TextView)findViewById(R.id.person_name);
        mPersonPhone = (TextView)findViewById(R.id.person_age);
        mPersonImage = (ImageView)findViewById(R.id.person_photo);

        mPersonName.setText("Krishnan Sriram Rama");
        mPersonPhone.setText("234-344-2344");
        mPersonImage.setImageResource(R.drawable.person);
    }
}
