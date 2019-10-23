package com.example.andorid.instagramscrap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class FollowingActivity extends AppCompatActivity {
    private RecyclerView mFollowing;
    private ArrayList<Following> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_following);

        mFollowing = findViewById(R.id.rvfollowing);
        mFollowing.setHasFixedSize(true);
        list.addAll(FollowingData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        mFollowing.setLayoutManager(new LinearLayoutManager(this));
        FollowingAdapter followingAdapter = new FollowingAdapter(list);
        mFollowing.setAdapter(followingAdapter);
    }
}
