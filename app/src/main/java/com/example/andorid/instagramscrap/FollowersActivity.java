package com.example.andorid.instagramscrap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class FollowersActivity extends AppCompatActivity {
    private RecyclerView mFollowers;
    private ArrayList<Followers> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_followers);

        mFollowers = findViewById(R.id.rvfollowers);
        mFollowers.setHasFixedSize(true);
        list.addAll(FollowersData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        mFollowers.setLayoutManager(new LinearLayoutManager(this));
        FollowersAdapter followersAdapter = new FollowersAdapter(list);
        mFollowers.setAdapter(followersAdapter);
    }
}
