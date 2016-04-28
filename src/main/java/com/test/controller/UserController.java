package com.test.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.constants.ErrorType;
import com.test.dto.ResultDTO;
import com.test.dto.UserDTO;
import com.test.dto.UsersDTO;
import com.test.param.UserParam;
import com.test.service.impl.UserServiceImpl;
import com.test.url.RestUrl;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

@Api(value = "userController", description = "用户管理", produces = MediaType.APPLICATION_JSON_VALUE)
@Controller
public class UserController {
	public static final Logger LOGGER = Logger.getLogger(UserController.class);
	@Autowired
	private UserServiceImpl userService;

	@ApiOperation(value = "获得所有用户列表信息", notes = "获取所有用户信息(用于数据同步)", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "用户列表信息"),
			@ApiResponse(code = 201, message = ErrorType.errorCheckToken+ "(token验证失败)", response = String.class),
			@ApiResponse(code = 202, message = ErrorType.error500 + "(系统错误)", response = String.class) })
	@RequestMapping(value = RestUrl.getUsers, method = RequestMethod.POST)
	@ResponseBody
	public void test(HttpServletRequest request, HttpServletResponse response) {
		try {
			String result = userService.testQuery();
			response.getWriter().print(result);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@ApiOperation(value = "根据用户ID获取用户信息", notes = "根据ID获取用户(用户数据同步)", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "用户信息"),
			@ApiResponse(code = 201, message = ErrorType.errorCheckToken+ "(token验证失败)", response = String.class),
			@ApiResponse(code = 202, message = ErrorType.error500 + "(系统错误)", response = String.class) })
	@RequestMapping(value = RestUrl.getUserById, method = RequestMethod.POST)
	@ResponseBody
	public ResultDTO<UsersDTO> getUserById(@ApiParam(value = "Json参数", required = true) @RequestBody UserParam param) throws Exception {
		return userService.getUserById(param);
	}
	
	@ApiOperation(value="添加用户", notes="添加用户信息", httpMethod="POST", produces=MediaType.APPLICATION_JSON_VALUE)
	@ApiResponses(value = {
		@ApiResponse(code = 200, message = "添加用户信息"),
		@ApiResponse(code = 201, message = ErrorType.errorCheckToken+ "(token验证失败)", response = String.class),
		@ApiResponse(code = 202, message = ErrorType.error500 + "(系统错误)", response = String.class) })
	@RequestMapping(value = RestUrl.addUser, method = RequestMethod.POST)
	@ResponseBody
	public String addUser(@ApiParam(value = "Json参数", required = true) @RequestBody UserDTO param) throws Exception {
	  return userService.addUser(param);
	}
	
	@ApiOperation(value="修改用户", notes="修改用户信息", httpMethod="POST", produces=MediaType.APPLICATION_JSON_VALUE)
	@ApiResponses(value = {
		@ApiResponse(code = 200, message = "修改用户信息"),
		@ApiResponse(code = 201, message = ErrorType.errorCheckToken+ "(token验证失败)", response = String.class),
		@ApiResponse(code = 202, message = ErrorType.error500 + "(系统错误)", response = String.class) })
	@RequestMapping(value = RestUrl.updateUser, method = RequestMethod.POST)
	@ResponseBody
	public String updateUser(@ApiParam(value = "Json参数", required = true) @RequestBody UserDTO param) throws Exception {
	  return userService.updateUser(param);
	}
	
	@ApiOperation(value="删除用户", notes="删除用户信息", httpMethod="POST", produces=MediaType.APPLICATION_JSON_VALUE)
	@ApiResponses(value = {
		@ApiResponse(code = 200, message = "删除用户信息"),
		@ApiResponse(code = 201, message = ErrorType.errorCheckToken+ "(token验证失败)", response = String.class),
		@ApiResponse(code = 202, message = ErrorType.error500 + "(系统错误)", response = String.class) })
	@RequestMapping(value = RestUrl.delUserById, method = RequestMethod.POST)
	@ResponseBody
	public String delUserById(@ApiParam(value = "Json参数", required = true) @RequestBody UserParam userParam) throws Exception {
	  return userService.delUserById(userParam);
	}
}
