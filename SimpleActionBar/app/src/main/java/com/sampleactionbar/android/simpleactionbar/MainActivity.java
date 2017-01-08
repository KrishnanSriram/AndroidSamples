package com.sampleactionbar.android.simpleactionbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView mWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWebView = (WebView)findViewById(R.id.webview);
        mWebView.getSettings().setLoadsImagesAutomatically(true);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        mWebView.setWebViewClient(new WebViewClient());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add:
                mWebView.loadUrl("http://grangenodewebscrapservice.azurewebsites.net/grange/privacysecurity");
                return true;
            case R.id.about:
                mWebView.loadUrl("http://grangenodewebscrapservice.azurewebsites.net/grange/privacysecurity");
                return true;
            case R.id.legal:
                mWebView.loadUrl("http://grangenodewebscrapservice.azurewebsites.net/grange/legal");
                return true;
            case R.id.contact_us:
                mWebView.loadUrl("http://grangenodewebscrapservice.azurewebsites.net/grange/contact");
                return true;
            case R.id.exit:
                finish();
                return true;
        }

        return (super.onOptionsItemSelected(item));
    }
}
