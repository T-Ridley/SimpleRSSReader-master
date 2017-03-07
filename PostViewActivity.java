package com.sample.foo.simplerssreader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.content.Context;
import android.content.Intent;


public class PostViewActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_post_view);

        //final String ARTICLE_URL = "ARTICLE_URL";
    }

}

/*Bundle bundle = this.getIntent().getExtras();
        String postContent = bundle.getString("content");

        webView = (WebView)this.findViewById(R.id.WebView);
        webView.loadData(postContent, "text/html; charset=utf-8:",":utf-8");
        */