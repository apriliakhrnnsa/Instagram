package com.example.andorid.instagramscrap;

import java.util.ArrayList;

public class FollowingData {
    private static String[] followingNames = {
            "Followers 1",
            "Followers 1",
            "Followers 1",  
            "Followers 1",
            "Followers 1",
            "Followers 1",
            "Followers 1"
    };

    private static String[] followingDetail = {
            "Benz",
            "Bike",
            "Car",
            "Carrera",
            "Ferrari",
            "Harly",
            "Lamborghini",
            "Silver"
    };

    private static int[] followingImages = {
            R.drawable.benz,
            R.drawable.bike,
            R.drawable.car,
            R.drawable.carrera,
            R.drawable.ferrari,
            R.drawable.harly,
            R.drawable.lamborghini,
            R.drawable.silver
    };

    static ArrayList<Following> getListData() {
        ArrayList<Following> list = new ArrayList<>();
        for (int position = 0; position < followingNames.length; position++) {
            Following Following = new Following();
            Following.setName(followingNames[position]);
            Following.setDetail(followingDetail[position]);
            Following.setPhoto(followingImages[position]);
            list.add(Following);
        }
        return list;
    }
}
