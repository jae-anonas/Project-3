package com.ga.roosevelt.project_3;

import android.content.Intent;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ShareActionProvider;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import android.widget.Toast;

public class ArticleDetailActivity extends AppCompatActivity {
    private ShareActionProvider mShareActionProvider;
    private String url;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article_detail);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        url = getIntent().getStringExtra("URL");

        WebView webView = (WebView) findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(url);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.article_detail_menu, menu);

        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        Intent intent = new Intent();

        switch(itemId){
            case android.R.id.home:
                finish();
                break;
            case R.id.action_share:
                Toast.makeText(this, "Sharing", Toast.LENGTH_SHORT).show();
                intent.setAction(Intent.ACTION_SEND)
                        .putExtra(Intent.EXTRA_TEXT, url)
                        .putExtra(android.content.Intent.EXTRA_SUBJECT, "New York Times News Article")
                        .setType("text/plain");
                startActivity(Intent.createChooser(intent,"Share via"));

                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
