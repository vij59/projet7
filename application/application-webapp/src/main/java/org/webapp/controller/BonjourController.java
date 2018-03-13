package org.webapp.controller;


import java.util.List;

import org.application.business.contract.ManagerFactory;
import org.application.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/bonjour")
public class BonjourController {

    @RequestMapping(method = RequestMethod.GET)
    public String afficherBonjour(final ModelMap pModel) {
       
        
        ApplicationContext vApplicationContext
        = new ClassPathXmlApplicationContext("classpath:/bootstrapContext.xml");
        
        ManagerFactory managerFactory = (ManagerFactory) vApplicationContext.getBean("managerFactory");
        List<User> list = managerFactory.getUserManager().getUsers();
        
        for(int i=0 ; i<list.size(); i++) {
        System.out.println(list.get(i).getUsername());
    }
        String pPersonne = list.get(0).getUsername();
        String pPersonne2 = list.get(1).getUsername();
        
        
        pModel.addAttribute("personne", pPersonne +" et " +pPersonne2);
        
        return "bonjour";
}
}