package org.webservice.services;

import org.application.business.contract.ManagerFactory;

public abstract class AbstractWebservice {


    private static ManagerFactory managerFactory;

    protected static ManagerFactory getManagerFactory() {
        return managerFactory;
    }
    public static void setManagerFactory(ManagerFactory pManagerFactory) {
        managerFactory = pManagerFactory;
    }


}