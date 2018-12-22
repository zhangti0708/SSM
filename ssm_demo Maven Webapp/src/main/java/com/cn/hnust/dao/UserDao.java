package com.cn.hnust.dao;

import org.springframework.stereotype.Repository;

import com.cn.hnust.entity.User;

@Repository
public interface  UserDao {
	
	
	public User findUserById(Integer userId) throws Exception;
	
	public int UserAdd(User user) throws Exception;
	
	public int UserDelete(Integer userId) throws Exception;
	
	public int UserUpdate(User user) throws Exception;

}
