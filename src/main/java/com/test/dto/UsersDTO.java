package com.test.dto;

import java.util.List;

import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * <b>function:</b> 商品信息DTO
 *
 * @author mousycoder
 * @createDate 2015年3月26日 下午1:44:14
 */
public class UsersDTO {

	@ApiModelProperty(value="商品信息",required=true)
	private List<UserDTO> userDTO;

	@ApiModelProperty(value="总数",required=true)
	private int count;

	public List<UserDTO> getUserDTO() {
		return userDTO;
	}

	public void setUserDTO(List<UserDTO> userDTO) {
		this.userDTO = userDTO;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
