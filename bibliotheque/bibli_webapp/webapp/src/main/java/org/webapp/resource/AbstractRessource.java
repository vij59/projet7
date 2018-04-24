package org.webapp.resource;

import org.application.business.contract.ManagerFactory;

import com.opensymphony.xwork2.ActionSupport;


public abstract class AbstractRessource extends ActionSupport {

    private static ManagerFactory managerFactory;

    protected static ManagerFactory getManagerFactory() {
        return managerFactory;
    }
    public static void setManagerFactory(ManagerFactory pManagerFactory) {
        managerFactory = pManagerFactory;
    }


}
