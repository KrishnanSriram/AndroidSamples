package com.sampleactionbar.android.simpleactionbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent containerIntent = null;
        switch (item.getItemId()) {
            case R.id.add:
                containerIntent = new Intent(this, ContainerActivity.class);
                containerIntent.putExtra("webLink", "http://grangenodewebscrapservice.azurewebsites.net/grange/privacysecurity");
                startActivity(containerIntent);
                return true;
            case R.id.about:
                containerIntent = new Intent(this, ContainerActivity.class);
                containerIntent.putExtra("webLink", "http://grangenodewebscrapservice.azurewebsites.net/grange/privacysecurity");
                startActivity(containerIntent);
                return true;
            case R.id.legal:
                containerIntent = new Intent(this, ContainerActivity.class);
                containerIntent.putExtra("webLink", "http://grangenodewebscrapservice.azurewebsites.net/grange/legal");
                startActivity(containerIntent);
                return true;
            case R.id.contact_us:
                containerIntent = new Intent(this, ContainerActivity.class);
                containerIntent.putExtra("webLink", "http://grangenodewebscrapservice.azurewebsites.net/grange/contact");
                startActivity(containerIntent);
                return true;
            case R.id.exit:
                finish();
                return true;
        }

        return (super.onOptionsItemSelected(item));
    }
}
