package org.application.run;

import java.util.List;

import org.application.business.contract.ManagerFactory;
import org.application.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {    
        ApplicationContext vApplicationContext
        = new ClassPathXmlApplicationContext("classpath:/bootstrapContext.xml");
        
        ManagerFactory managerFactory = (ManagerFactory) vApplicationContext.getBean("managerFactory");
        List<User> list = managerFactory.getUserManager().getUsers();
        
        for(int i=0 ; i<list.size(); i++) {
        System.out.println(list.get(i).getUsername());
        }
    }
}
