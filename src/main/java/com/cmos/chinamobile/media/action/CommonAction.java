package com.cmos.chinamobile.media.action;

import com.cmos.core.bean.OutputObject;
import com.cmos.core.logger.Logger;
import com.cmos.core.logger.LoggerFactory;

/**
 * 
 * 
 */
public class CommonAction extends BaseAction {
	private static final long serialVersionUID = 2021751417577646314L;
	private static final Logger logger = LoggerFactory.getActionLog(CommonAction.class);
	
	/** Uniform Method Invocation **/
	public String execute() {
		logger.info("execute", "Start");
		OutputObject object = super.getOutputObject();
		super.sendJson(super.convertOutputObject2Json(object));
		logger.info("execute", "End");
		return null;
	}
}
