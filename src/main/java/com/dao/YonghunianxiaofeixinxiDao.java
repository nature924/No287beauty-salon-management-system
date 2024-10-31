package com.dao;

import com.entity.YonghunianxiaofeixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YonghunianxiaofeixinxiVO;
import com.entity.view.YonghunianxiaofeixinxiView;


/**
 * 用户年消费信息
 * 
 * @author 
 * @email 
 * @date 2021-04-26 10:06:06
 */
public interface YonghunianxiaofeixinxiDao extends BaseMapper<YonghunianxiaofeixinxiEntity> {
	
	List<YonghunianxiaofeixinxiVO> selectListVO(@Param("ew") Wrapper<YonghunianxiaofeixinxiEntity> wrapper);
	
	YonghunianxiaofeixinxiVO selectVO(@Param("ew") Wrapper<YonghunianxiaofeixinxiEntity> wrapper);
	
	List<YonghunianxiaofeixinxiView> selectListView(@Param("ew") Wrapper<YonghunianxiaofeixinxiEntity> wrapper);

	List<YonghunianxiaofeixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<YonghunianxiaofeixinxiEntity> wrapper);
	
	YonghunianxiaofeixinxiView selectView(@Param("ew") Wrapper<YonghunianxiaofeixinxiEntity> wrapper);
	
}
