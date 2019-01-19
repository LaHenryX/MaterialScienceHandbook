package com.handbock.material.materialsciencehandbook;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class Material_Science_Handbook extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material__science__handbook);
        String myurl="file:///android_asset/first_page.html";
        WebView view = (WebView) findViewById(R.id.starting_page);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl (myurl);


        String secondurl="file:///android_asset/landscape_left.html";
        WebView doubleview = (WebView) findViewById(R.id.landscape_left);
        doubleview.getSettings().setJavaScriptEnabled(true);
        doubleview.loadUrl (secondurl);

        String trippleurl="file:///android_asset/landscape_right.html";
        WebView trippleview = (WebView) findViewById(R.id.landscape_right);
        trippleview.getSettings().setJavaScriptEnabled(true);
        trippleview.loadUrl (trippleurl);

        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openList();
            }
        });
    }
    public void openList() {
        Intent intent = new Intent(this, PlasticListActivity.class);
        startActivity (intent);
    }
}