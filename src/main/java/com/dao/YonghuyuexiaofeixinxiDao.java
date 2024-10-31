package com.dao;

import com.entity.YonghuyuexiaofeixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YonghuyuexiaofeixinxiVO;
import com.entity.view.YonghuyuexiaofeixinxiView;


/**
 * 用户月消费信息
 * 
 * @author 
 * @email 
 * @date 2021-04-26 10:06:06
 */
public interface YonghuyuexiaofeixinxiDao extends BaseMapper<YonghuyuexiaofeixinxiEntity> {
	
	List<YonghuyuexiaofeixinxiVO> selectListVO(@Param("ew") Wrapper<YonghuyuexiaofeixinxiEntity> wrapper);
	
	YonghuyuexiaofeixinxiVO selectVO(@Param("ew") Wrapper<YonghuyuexiaofeixinxiEntity> wrapper);
	
	List<YonghuyuexiaofeixinxiView> selectListView(@Param("ew") Wrapper<YonghuyuexiaofeixinxiEntity> wrapper);

	List<YonghuyuexiaofeixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<YonghuyuexiaofeixinxiEntity> wrapper);
	
	YonghuyuexiaofeixinxiView selectView(@Param("ew") Wrapper<YonghuyuexiaofeixinxiEntity> wrapper);
	
}
