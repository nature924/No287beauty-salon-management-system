package com.dao;

import com.entity.MeirongxiangmuniantongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MeirongxiangmuniantongjiVO;
import com.entity.view.MeirongxiangmuniantongjiView;


/**
 * 美容项目年统计
 * 
 * @author 
 * @email 
 * @date 2021-04-26 10:06:05
 */
public interface MeirongxiangmuniantongjiDao extends BaseMapper<MeirongxiangmuniantongjiEntity> {
	
	List<MeirongxiangmuniantongjiVO> selectListVO(@Param("ew") Wrapper<MeirongxiangmuniantongjiEntity> wrapper);
	
	MeirongxiangmuniantongjiVO selectVO(@Param("ew") Wrapper<MeirongxiangmuniantongjiEntity> wrapper);
	
	List<MeirongxiangmuniantongjiView> selectListView(@Param("ew") Wrapper<MeirongxiangmuniantongjiEntity> wrapper);

	List<MeirongxiangmuniantongjiView> selectListView(Pagination page,@Param("ew") Wrapper<MeirongxiangmuniantongjiEntity> wrapper);
	
	MeirongxiangmuniantongjiView selectView(@Param("ew") Wrapper<MeirongxiangmuniantongjiEntity> wrapper);
	
}
