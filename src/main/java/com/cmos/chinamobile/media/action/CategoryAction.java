package com.cmos.chinamobile.media.action;

import com.cmos.chinamobile.media.action.base.ActionResult;
import com.cmos.core.logger.Logger;
import com.cmos.core.logger.LoggerFactory;


/**
 * 对分类对象的页面控制器
 * 
 * @author Clark.R 2016年3月29日
 *
 */
public class CategoryAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LoggerFactory.getActionLog(CategoryAction.class);
	
	
	public String execute() {
		logger.info("execute", "Start");
		ActionResult<Object> result = super.getActionResult();
		super.sendJson(super.convertOutputObject2Json(result));
		logger.info("execute", "End");
		return null;
	}
	
}
