package com.test.dao;

import java.util.List;

import com.test.dto.UserDTO;
import com.test.param.UserParam;

public interface UserDao {
	/**
	 * 查询所有用户
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<UserDTO> testQuery() throws Exception;

	/**
	 * 根据id查询用户信息
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public UserDTO getUserById(UserParam param) throws Exception;

	/**
	 * 添加用户
	 * 
	 * @param userDTO
	 * @return
	 * @throws Exception
	 */
	public int addUser(UserDTO userDTO) throws Exception;

	/**
	 * 修改用户
	 * 
	 * @param userDTO
	 * @return
	 * @throws Exception
	 */
	public int updateUser(UserDTO userDTO) throws Exception;
	
	/**
	 * 删除用户
	 * @param Id
	 * @return
	 * @throws Exception
	 */
	public int delUserById( UserParam userParam) throws Exception;
}
