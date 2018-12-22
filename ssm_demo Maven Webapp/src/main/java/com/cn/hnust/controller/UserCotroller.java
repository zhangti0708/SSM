package com.cn.hnust.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.hnust.bean.InputParamBean;
import com.cn.hnust.bean.OutputResultBean;
import com.cn.hnust.bean.OutputResultUtil;
import com.cn.hnust.service.UserService;


@Controller
@RequestMapping(value = "/main/user/login/")
public class UserCotroller {
	private Logger logger = Logger.getLogger(UserCotroller.class);
	@Resource
	private UserService UserService;
	
	/**
	 * id查询用户
	 * 
	 * */
	@RequestMapping(value = "getUserData")
	@ResponseBody
	public  OutputResultBean getUserData(HttpServletRequest request,InputParamBean bean) {
		logger.info("******************* getUserData!!! *******************");
		OutputResultBean resultBean = null;
		try {
			 resultBean = UserService.getUserByid(bean);
			 if(resultBean == null) {
				 resultBean = OutputResultUtil.RESULE_FAIL;
			 }
		} catch (Exception e) {
			resultBean = OutputResultUtil.RESULE_FAIL;
			logger.error("getUserData error:" + e);
		} 
		 return resultBean;
	}
	
	/**
	 * 添加新用户
	 * 
	 * */
	@RequestMapping(value = "saveUserData")
	@ResponseBody
	public  OutputResultBean addUserData(HttpServletRequest request,InputParamBean bean) { 
		logger.info("******************* addUserData!!! *******************");
		OutputResultBean resultBean = null;
		try {
			 resultBean = UserService.saveUser(bean);
			 if(resultBean == null) {
				 resultBean = OutputResultUtil.RESULE_FAIL;
			 }
		} catch (Exception e) {
			resultBean = OutputResultUtil.RESULE_FAIL;
			logger.error("saveUserData error:" + e);
		} 
		 return resultBean;
	}
	
	/**
	 * id 删除用户
	 * 
	 * */
	@RequestMapping(value = "delUserData")
	@ResponseBody
	public  OutputResultBean delUserData(HttpServletRequest request,InputParamBean bean) { 
		logger.info("******************* delUserData!!! *******************");
		OutputResultBean resultBean = null;
		try {
			 resultBean = UserService.rmoverUser(bean);
			 if(resultBean == null) {
				 resultBean = OutputResultUtil.RESULE_FAIL;
			 }
		} catch (Exception e) {
			resultBean = OutputResultUtil.RESULE_FAIL;
			logger.error("delUserData error:" + e);
		} 
		 return resultBean;
	}
	
	/**
	 * 修改用户
	 * 
	 * */
	@RequestMapping(value = "modtUserData")
	@ResponseBody
	public  OutputResultBean modtUserData(HttpServletRequest request,InputParamBean bean) {
		logger.info("******************* modtUserData!!! *******************");
		OutputResultBean resultBean = null;
		try {
			 resultBean = UserService.changeUser(bean);
			 if(resultBean == null) {
				 resultBean = OutputResultUtil.RESULE_FAIL;
			 }
		} catch (Exception e) {
			resultBean = OutputResultUtil.RESULE_FAIL;
			logger.error("modtUserData error:" + e);
		} 
		 return resultBean;
	}
}
