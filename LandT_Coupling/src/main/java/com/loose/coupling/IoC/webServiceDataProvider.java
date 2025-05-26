package com.loose.coupling.IoC;

public class webServiceDataProvider implements UserDataProvider{

    @Override
    public String getUserDetails() {
        return "Getting Details from webService provider";
    }
}
