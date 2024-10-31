package com.dao;

import com.entity.JishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JishiVO;
import com.entity.view.JishiView;


/**
 * 技师
 * 
 * @author 
 * @email 
 * @date 2021-04-26 10:06:05
 */
public interface JishiDao extends BaseMapper<JishiEntity> {
	
	List<JishiVO> selectListVO(@Param("ew") Wrapper<JishiEntity> wrapper);
	
	JishiVO selectVO(@Param("ew") Wrapper<JishiEntity> wrapper);
	
	List<JishiView> selectListView(@Param("ew") Wrapper<JishiEntity> wrapper);

	List<JishiView> selectListView(Pagination page,@Param("ew") Wrapper<JishiEntity> wrapper);
	
	JishiView selectView(@Param("ew") Wrapper<JishiEntity> wrapper);
	
}
