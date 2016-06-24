package com.cmos.chinamobile.media.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.cmos.chinamobile.media.action.UserAction;
import com.cmos.core.util.User;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class CSRFInterceptor extends AbstractInterceptor {

	private static final long serialVersionUID = -6047388094890251679L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		HttpSession session = request.getSession();
		
		if(invocation.getAction().getClass() != UserAction.class){
			User user = (User)session.getAttribute("usersession");
			if(user==null){
				response.getWriter().write("{\"status\":\"unlogin\"}");
				return null;
			}
		}
		String referer = request.getHeader("Referer");
//		if(!referer.startsWith("http://localhost:8090/")){
//			return null;
//		}
		return invocation.invoke();
	}
}
