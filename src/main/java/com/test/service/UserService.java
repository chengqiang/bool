package com.test.service;

import com.test.dto.ResultDTO;
import com.test.dto.UserDTO;
import com.test.dto.UsersDTO;
import com.test.param.UserParam;

public interface UserService {
	public String testQuery() throws Exception;
	public ResultDTO<UsersDTO> getUserById(UserParam param) throws Exception;
	public String addUser(UserDTO userDTO) throws Exception;
	public String updateUser(UserDTO userDTO) throws Exception;
	public String delUserById(UserParam userParam) throws Exception;
}
