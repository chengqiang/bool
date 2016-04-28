package com.test.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.UserDao;
import com.test.dto.ResultDTO;
import com.test.dto.UserDTO;
import com.test.dto.UsersDTO;
import com.test.param.UserParam;
import com.test.service.UserService;
import com.test.status.ResultStatus;

@Service
public  class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;

	public String testQuery() throws Exception {
		List<UserDTO> users = dao.testQuery();
		// User u1 = new User("zhangsan", 18);
		// User u2 = new User("lisi", 19);
		// User u3 = new User("wangwu", 12);
		// users.add(u1);
		// users.add(u2);
		// users.add(u3);
		// List<User> users = new ArrayList<User>();
		String res = "";
		if (users != null && users.size() > 0) {
			for (UserDTO user : users) {
				res += user.toString() + "|";
			}
		} else {
			res = "Not found.";
		}
		return res;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.test.service.UserService#getUserById(int)
	 */
	@Override
	public ResultDTO<UsersDTO> getUserById(UserParam param) throws Exception {
		UserDTO userDto = dao.getUserById(param);

		List<UserDTO> list = new ArrayList<UserDTO>();
		list.add(userDto);

		UsersDTO data = new UsersDTO();
		data.setUserDTO(list);
		data.setCount(list.size());

		ResultDTO<UsersDTO> dto = new ResultDTO<UsersDTO>();
		dto.setStatus(ResultStatus.SUCCESS);
		dto.setData(data);
		return dto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.test.service.UserService#addUser(com.test.dto.UserDTO)
	 */
	@Override
	public String addUser(UserDTO userDTO) throws Exception {
		int res = dao.addUser(userDTO);
		String ok = "ad_ok".toString();
		if (res > 0) {
			return ok;
		}
		return "ad_no";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.test.service.UserService#updateUser(com.test.dto.UserDTO)
	 */
	@Override
	public String updateUser(UserDTO userDTO) throws Exception {
		int res = dao.updateUser(userDTO);
		String ok = "upok".toString();
		if (res > 0) {
			return ok;
		}
		return "upfiled";
	}

	/* (non-Javadoc)
	 * @see com.test.service.UserService#delteUser(int)
	 */
	@Override
	public String delUserById(UserParam userParam) throws Exception {
		// TODO Auto-generated method stub
		int res = dao.delUserById(userParam);
		String ok = "deOk".toString();
		if (res > 0) {
			return ok;
		}
		return "defiled";
	}
}
