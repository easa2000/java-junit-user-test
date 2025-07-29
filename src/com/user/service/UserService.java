package com.user.service;
import com.user.model.User;

public class UserService {
    public String greetUser(User user) {
        return "Welcome, " + user.getName() + "!";
    }

    public boolean canRegister(User user) {
        return user.isAdult();
    }
}
