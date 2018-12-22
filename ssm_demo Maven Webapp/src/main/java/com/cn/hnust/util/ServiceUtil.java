package com.cn.hnust.util;

public class ServiceUtil {
	
	/**
	 * 处理返回结果
	 * 
	 * */
	public static final int STATUS_SUCCESS = 0;
	public static final int STATUS_FAIL = 1; 
	public static final String INFO_SUCCESS = "请求处理成功";
	public static final String INFO_FAIL = "未查询到数据,请更换请求条件!";
	public static final String INFO_FAIL_NO_SESSION = "您还未登陆系统,请先登陆系统!";
	
	
	
	/**
	 * 获取dao查询时间
	 * 
	 * */
	public static final long TIME = System.currentTimeMillis();
	
	
	
}
