package com.cn.hnust.logic;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.cn.hnust.bean.InputParamBean;
import com.cn.hnust.dao.UserDao;
import com.cn.hnust.entity.User;
import com.cn.hnust.util.ServiceUtil;

import sun.print.resources.serviceui;

/***
 * 业务层
 * logic
 * 处理查询逻辑
 * */
@Service
public class UserServiceLogic {
	private Logger logger = Logger.getLogger(UserServiceLogic.class);
	
	@Resource
	private UserDao userDao;
	/**
	 * id 查询用户
	 * */
	public Object getUserDataLogic(InputParamBean bean) {
		logger.info("进入UserServiceLogic getUserDataLogic方法!!!");
		User result = null;
		try {
			long time = ServiceUtil.TIME;
			result = userDao.findUserById(bean.getUser_id());
			
			logger.info("findUserById查询时间为:"+ (System.currentTimeMillis() - time) + "ms");
		} catch (Exception e) {
			
			logger.error(e,e);
		}
		return result;
	}
	/**
	 * 添加用户
	 * */
	public Object addUserDataLogic(InputParamBean bean) {
		logger.info("进入UserServiceLogic addUserDataLogic方法!!!");
		User user = new User();
		int result = 0;
		try {
			user.setName(bean.getUser_name());
			user.setPassword(bean.getUser_password());
			user.setType(bean.getUser_type());
			user.setCode(bean.getUser_code());
			result = userDao.UserAdd(user);
		} catch (Exception e) {
			
			logger.error(e,e);
		}
		return result;
	}
	/**
	 * id 删除用户
	 * */
	public Object deleteUserDataLogic(InputParamBean bean) {
		logger.info("进入UserServiceLogic deleteUserDataLogic方法!!!");
		int result = 0;
		try {
			result = userDao.UserDelete(bean.getUser_id());;
			
		} catch (Exception e) {
			
			logger.error(e,e);
		}
		return result;
	}
	/**
	 * 修改用户
	 * */
	public Object updateUserDataLogic(InputParamBean bean) {
		logger.info("进入UserServiceLogic updateUserDataLogic方法!!!");
		User user = new User();
		int result = 0;
		try {
			user.setId(bean.getUser_id());
			user.setName(bean.getUser_name());
			user.setPassword(bean.getUser_password());
			user.setType(bean.getUser_type());
			user.setCode(bean.getUser_code());
			result = userDao.UserUpdate(user);
			
		} catch (Exception e) {
			
			logger.error(e,e);
		}
		return result;
	}
	
	
	
	

}
