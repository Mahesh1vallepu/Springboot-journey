package com.loose.coupling.IoC;

public class UserManager {

    private UserDataProvider userDataProvider; // Loose Coupling

    public UserManager(UserDataProvider userDataProvider) {
        this.userDataProvider = userDataProvider;
    }

    public String getUserDetails()
    {
        return userDataProvider.getUserDetails();
    }
}
