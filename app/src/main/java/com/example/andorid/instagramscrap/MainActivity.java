package com.example.andorid.instagramscrap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void showFollowers(View view) {
        Intent intent = new Intent(MainActivity.this, FollowersActivity.class);
        startActivity(intent);
    }

    public void showFollowing(View view) {
        Intent intent = new Intent(MainActivity.this, FollowingActivity.class);
        startActivity(intent);
    }
}
