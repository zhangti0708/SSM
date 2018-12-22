package com.cn.hnust.service;

import com.cn.hnust.bean.InputParamBean;
import com.cn.hnust.bean.OutputResultBean;
import com.cn.hnust.entity.User;

public interface UserService {
	
	public OutputResultBean getUserByid(InputParamBean bean);
	
	public OutputResultBean saveUser(InputParamBean bean);
	
	public OutputResultBean rmoverUser(InputParamBean bean);
	
	public OutputResultBean changeUser(InputParamBean bean);

}
