package com.shopping.services;

public class LoginService {
    public boolean authenticate(String username, String password) {
        if (username != null && username.trim().equalsIgnoreCase("admin") && password != null
                && password.trim().equalsIgnoreCase("admin")) {
            return true;
        }
        return false;
    }
}
