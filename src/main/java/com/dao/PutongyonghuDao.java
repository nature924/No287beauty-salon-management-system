package com.dao;

import com.entity.PutongyonghuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PutongyonghuVO;
import com.entity.view.PutongyonghuView;


/**
 * 普通用户
 * 
 * @author 
 * @email 
 * @date 2021-04-26 10:06:05
 */
public interface PutongyonghuDao extends BaseMapper<PutongyonghuEntity> {
	
	List<PutongyonghuVO> selectListVO(@Param("ew") Wrapper<PutongyonghuEntity> wrapper);
	
	PutongyonghuVO selectVO(@Param("ew") Wrapper<PutongyonghuEntity> wrapper);
	
	List<PutongyonghuView> selectListView(@Param("ew") Wrapper<PutongyonghuEntity> wrapper);

	List<PutongyonghuView> selectListView(Pagination page,@Param("ew") Wrapper<PutongyonghuEntity> wrapper);
	
	PutongyonghuView selectView(@Param("ew") Wrapper<PutongyonghuEntity> wrapper);
	
}
