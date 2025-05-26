package com.tight.coupling;

public class UserManager {

    private UserDatabase userDatabase = new UserDatabase(); // Tightly Coupled

    public String getUserInfo()
    {
        return userDatabase.getUserDetails();
    }
}
