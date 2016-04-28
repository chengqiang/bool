package com.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.test.dto.CommoditiesDTO;
import com.test.dto.CommodityDTO;
import com.test.dto.ResultDTO;
import com.test.param.BaseParam;
import com.test.status.CommodityStatus;
import com.test.status.ResultStatus;

/**
 * <b>function:</b> 商品管理模块逻辑层
 *
 * @author mousycoder
 * @createDate 2015年3月26日 下午1:52:06
 */
@Service
public class CommodityService {

	public ResultDTO<CommoditiesDTO> getCommodity(BaseParam param) {
		
		CommodityDTO comDto = new CommodityDTO();
		comDto.setBarcode("12345678");
		comDto.setCategoryId(1L);
		comDto.setCategoryName("奶制品");
		comDto.setId(1L);
		comDto.setName("娃哈哈AD钙奶");
		comDto.setParentCategoryName("饮品");
		comDto.setPicPath("http://img-storage.qiniudn.com/15-7-2/78380693.jpg");
		comDto.setPrice(2.00);
		comDto.setStatus(CommodityStatus.ON_SALE);
		comDto.setStock(20);
		
		List<CommodityDTO> list = new ArrayList<CommodityDTO>();
		list.add(comDto);
		
		CommoditiesDTO data = new CommoditiesDTO();
		data.setCommodityDTO(list);
		data.setCount(list.size());
		
		ResultDTO<CommoditiesDTO> dto = new ResultDTO<CommoditiesDTO>();
		dto.setStatus(ResultStatus.SUCCESS);
		dto.setData(data);
		return dto;
	}
	public ResultDTO<CommoditiesDTO> getCommodity1(BaseParam param) {
		
		CommodityDTO comDto = new CommodityDTO();
		comDto.setBarcode("12345678");
		comDto.setCategoryId(1L);
		comDto.setCategoryName("奶制品");
		comDto.setId(1L);
		comDto.setName("娃哈哈AD钙奶");
		comDto.setParentCategoryName("饮品");
		comDto.setPicPath("http://img-storage.qiniudn.com/15-7-2/78380693.jpg");
		comDto.setPrice(2.00);
		comDto.setStatus(CommodityStatus.ON_SALE);
		comDto.setStock(20);
		
		List<CommodityDTO> list = new ArrayList<CommodityDTO>();
		list.add(comDto);
		
		CommoditiesDTO data = new CommoditiesDTO();
		data.setCommodityDTO(list);
		data.setCount(list.size());
		
		ResultDTO<CommoditiesDTO> dto = new ResultDTO<CommoditiesDTO>();
		dto.setStatus(ResultStatus.SUCCESS);
		dto.setData(data);
		return dto;
	}
}

