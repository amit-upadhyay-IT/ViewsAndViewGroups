package com.aupadhyay.applications;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity1 extends AppCompatActivity implements View.OnClickListener {

    CardView tableLayoutCardView, webViewCardView, CBardView;

    public void initCardView()
    {
        tableLayoutCardView = (CardView) findViewById(R.id.tableLayoutCardView);
        webViewCardView = (CardView) findViewById(R.id.webViewCardView);
        CBardView = (CardView) findViewById(R.id.CBardView);

        tableLayoutCardView.setOnClickListener(this);
        webViewCardView.setOnClickListener(this);
        CBardView.setOnClickListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        initCardView();
    }

    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.tableLayoutCardView: {
                Intent intent = new Intent(getApplicationContext(), TableLayoutActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.webViewCardView: {
                Intent intent = new Intent(this, WebViewActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.CBardView:
                Intent intent = new Intent(this, CheckBoxActivity.class);
                startActivity(intent);
                break;
        }

    }
}
