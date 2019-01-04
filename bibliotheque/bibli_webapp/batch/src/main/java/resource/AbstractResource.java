package resource;


import com.opensymphony.xwork2.ActionSupport;
import org.application.business.contract.ManagerFactory;

public class AbstractResource extends ActionSupport {

    private static ManagerFactory managerFactory;

    protected static ManagerFactory getManagerFactory() {
        return managerFactory;
    }
    public static void setManagerFactory(ManagerFactory pManagerFactory) {
        managerFactory = pManagerFactory;
    }


}