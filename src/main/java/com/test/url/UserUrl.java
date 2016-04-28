package com.test.url;


/**
 * <b>function:</b>用户模块
 *
 * @author mousycoder
 * @createDate 2015年3月26日 下午1:46:22
 */
public interface UserUrl {

	/**
	 * 获取用户列表信息
	 */
	String getUsers = "/sc/user/getUsers";
	
	/**
	 * 获取用户信息By id
	 */
	String getUserById = "/sc/user/getUserById";
	/**
	 * 添加用户
	 */
	String addUser="/sc/user/addUser";
	/**
	 * 修改用户
	 */
	String updateUser="/sc/user/updateUser";
	
	/**
	 * 删除用户
	 */
	String delUserById="/sc/user/deleteUser";
}
