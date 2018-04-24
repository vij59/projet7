package org.webapp.action;

import java.util.Map;

import org.webservice.services.Utilisateur;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AuthentificationInterceptor extends AbstractInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7057699910816161327L;

	

	  @Override
	    public String intercept(ActionInvocation pInvocation) throws Exception {
	        String vResult;
	        if (pInvocation.getInvocationContext().getSession().get("user") != null) {
	            vResult = pInvocation.invoke();
	        } else {
	            vResult = "error-forbidden";
	        }
	        return vResult;
	    }
}
