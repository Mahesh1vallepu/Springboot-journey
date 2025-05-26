package com.loose.coupling.IoC;

public class UserDatabaseProvider implements UserDataProvider {

    public String getUserDetails(){

        //Directly setup and access database from here if you want
        return "User Details from DatabaseProvider";
    }
}
