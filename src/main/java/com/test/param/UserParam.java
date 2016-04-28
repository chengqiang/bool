/**
 * This document and its contents are protected by copyright 2012 and owned by Melot Inc.
 * The copying and reproduction of this document and/or its content (whether wholly or partly) or any
 * incorporation of the same into any other material in any media or format of any kind is strictly prohibited.
 * All rights are reserved.
 *
 * Copyright (c) Melot Inc. 2016
 */
package com.test.param;

import com.test.dto.UserBaseDTO;
import com.wordnik.swagger.annotations.ApiModelProperty;

/**
 * Title: TODO
 * <p>
 * Description: 
 * </p>
 * 
 * @author 程强<a href="mailto:qiang.cheng@melot.cn">
 * @version V1.0
 * @since 2016年4月14日 下午5:41:10
 */
public class UserParam implements UserBaseDTO {
	@ApiModelProperty(value="用户Id",required=true)
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
