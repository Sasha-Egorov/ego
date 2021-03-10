package com.egorov.homeworks.homework17;

import com.google.gson.Gson;

public class TransformToUser {

    public User createNewUser(String info) {
        User user = new Gson().fromJson(info, User.class);
        return user;
    }
}
