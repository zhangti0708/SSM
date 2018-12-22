package com.cn.hnust.service.impl;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.cn.hnust.bean.InputParamBean;
import com.cn.hnust.bean.OutputResultBean;
import com.cn.hnust.bean.OutputResultUtil;
import com.cn.hnust.dao.UserDao;
import com.cn.hnust.entity.User;
import com.cn.hnust.logic.UserServiceLogic;
import com.cn.hnust.service.UserService;
import com.cn.hnust.util.ServiceUtil;

/**
 * 业务接口实现层
 * 用于控制层与业务层交互
 * 
 * */
@Service
public class UserServiceImpl implements UserService{
		
	private Logger logger = Logger.getLogger(UserServiceImpl.class);
	@Resource
	private UserServiceLogic userServiceLogic;
	

	@Override
	public OutputResultBean getUserByid(InputParamBean bean) {
		logger.info("进入userService getUserByid方法!!!");
		OutputResultBean resultBean = null;
		try {
			Object result = userServiceLogic.getUserDataLogic(bean);
			
			if (result != null) {	
				resultBean = OutputResultUtil.getResultSuccess(result);
			}
		} catch (Exception e) {
			logger.error(e,e);
			e.printStackTrace();
		}
		return resultBean;
	}


	@Override
	public OutputResultBean saveUser(InputParamBean bean) {
		logger.info("进入userService saveUser方法!!!");
		OutputResultBean resultBean = null;
		try {
			Object result = userServiceLogic.addUserDataLogic(bean);
			if (result != null) {	
				resultBean = OutputResultUtil.getResultSuccess(result);
			}
		} catch (Exception e) {
			logger.error(e,e);
			e.printStackTrace();
		}
		return resultBean;
	}


	@Override
	public OutputResultBean rmoverUser(InputParamBean bean) {
		logger.info("进入userService rmoverUser方法!!!");
		OutputResultBean resultBean = null;
		try {
			Object result = userServiceLogic.deleteUserDataLogic(bean);
			if (result != null) {	
				resultBean = OutputResultUtil.getResultSuccess(result);
			}
		} catch (Exception e) {
			logger.error(e,e);
			e.printStackTrace();
		}
		return resultBean;
	}


	@Override
	public OutputResultBean changeUser(InputParamBean bean) {
		logger.info("进入userService changeUser方法!!!");
		OutputResultBean resultBean = null;
		try {
			Object result = userServiceLogic.updateUserDataLogic(bean);
			if (result != null) {	
				resultBean = OutputResultUtil.getResultSuccess(result);
			}
		} catch (Exception e) {
			logger.error(e,e);
			e.printStackTrace();
		}
		return resultBean;
	}

	

}
