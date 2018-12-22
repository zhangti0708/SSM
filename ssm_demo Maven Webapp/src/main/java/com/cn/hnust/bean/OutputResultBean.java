package com.cn.hnust.bean;

import java.io.Serializable;

import com.cn.hnust.util.ServiceUtil;

public class OutputResultBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private int status = 0;
	private String info;
	private Object result;
	
	public OutputResultBean(int status, String info, Object result) {
		super();
		this.status = status;
		this.info = info;
		this.result = result;
	}
	
	public OutputResultBean(int status, String info) {
		super();
		this.status = status;
		this.info = info;
	}
	
	public OutputResultBean(Object result) {
		super();
		this.status = ServiceUtil.STATUS_SUCCESS;
		this.info = ServiceUtil.INFO_SUCCESS;
		this.result = result;
	}
	
	public OutputResultBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public Object getResult() {
		return result;
	}
	public void setResult(Object result) {
		this.result = result;
	}
	

}
