package com.cn.hnust.bean;

import com.cn.hnust.util.ServiceUtil;

public class OutputResultUtil {
	
	/**
	 * 默认失败
	 * 
	 * */
	public static final OutputResultBean RESULE_FAIL = new 
			OutputResultBean(ServiceUtil.STATUS_FAIL,ServiceUtil.INFO_FAIL);
	
	
	
	/**
	 * 默认成功
	 * 
	 * */
	public static OutputResultBean getResultSuccess(Object result) {	
		return new OutputResultBean(result);	
	}
	
	

}
