package com.example.andorid.instagramscrap;

import java.util.ArrayList;

public class FollowersData {
    private static String[] followersNames = {
            "Followers 1",
            "Followers 1",
            "Followers 1",
            "Followers 1",
            "Followers 1",
            "Followers 1",
            "Followers 1"
    };

    private static String[] followersDetail = {
            "Benz",
            "Bike",
            "Car",
            "Carrera",
            "Ferrari",
            "Harly",
            "Lamborghini",
            "Silver"
    };

    private static int[] followersImages = {
            R.drawable.benz,
            R.drawable.bike,
            R.drawable.car,
            R.drawable.carrera,
            R.drawable.ferrari,
            R.drawable.harly,
            R.drawable.lamborghini,
            R.drawable.silver
    };

    static ArrayList<Followers> getListData() {
        ArrayList<Followers> list = new ArrayList<>();
        for (int position = 0; position < followersNames.length; position++) {
            Followers Followers = new Followers();
            Followers.setName(followersNames[position]);
            Followers.setDetail(followersDetail[position]);
            Followers.setPhoto(followersImages[position]);
            list.add(Followers);
        }
        return list;
    }
}
