package com.androapp.collageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class ViewWebsiteActivity extends AppCompatActivity {

    WebView w1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_website);
        w1=(WebView) findViewById(R.id.web);
        w1.loadUrl("https://www.mzce.ac.in/");
    }
}