package com.cit.challengeit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Muzaffer YILMAZ on 6.3.2018.
 */

public class StartOrJoinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_or_join);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_start_or_join_start)
    public void onStartClicked() {
        startActivity(new Intent(this, StartActivity.class));
    }

    @OnClick(R.id.btn_start_or_join_join)
    public void onJoinClicked() {
        startActivity(new Intent(this, JoinActivity.class));
    }
}