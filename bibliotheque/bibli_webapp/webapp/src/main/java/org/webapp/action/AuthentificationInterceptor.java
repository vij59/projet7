package org.webapp.action;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AuthentificationInterceptor extends AbstractInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */

	@Override
	public String intercept(ActionInvocation pInvocation) throws Exception {
		String vResult;
		if (pInvocation.getInvocationContext().getSession().get("login") != null) {
			vResult = pInvocation.invoke();
		} else {
			vResult = "error";
		}
		return vResult;
	}
}
