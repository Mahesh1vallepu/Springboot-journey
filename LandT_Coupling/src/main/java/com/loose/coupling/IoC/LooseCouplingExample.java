package com.loose.coupling.IoC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCouplingExample {
    public static void  main(String []args)
    {
//        UserDataProvider userDataProvider = new UserDatabaseProvider();
//        UserManager userManagerDb = new UserManager(userDataProvider);
//
//        System.out.println(userManagerDb.getUserDetails());
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationLooseCoupling.xml");
        UserManager dataBaseProv = (UserManager) context.getBean("managerWithDataBaseProvider");
        System.out.println(dataBaseProv.getUserDetails());

//        UserDataProvider webService= new webServiceDataProvider();
//        UserManager userManagerWs = new UserManager(webService);
//
//        System.out.println(userManagerWs.getUserDetails());

        UserManager webServiceProv= (UserManager) context.getBean("managerWithWebServiceProvider");
        System.out.println(webServiceProv.getUserDetails());

    }
}