package com.cmos.chinamobile.media.action;

import com.cmos.core.logger.Logger;
import com.cmos.core.logger.LoggerFactory;

/**
 * 
 * 
 */
public class LoginAction extends BaseAction {
	private static final long serialVersionUID = -3579032710235743396L;
	private static final Logger logger = LoggerFactory.getActionLog(LoginAction.class);

	public String index() {
		String method = "execute";
		logger.debug(method, "user login.");
		return SUCCESS;
	}
}
