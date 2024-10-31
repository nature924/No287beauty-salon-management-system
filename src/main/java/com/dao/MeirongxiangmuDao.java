package com.dao;

import com.entity.MeirongxiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MeirongxiangmuVO;
import com.entity.view.MeirongxiangmuView;


/**
 * 美容项目
 * 
 * @author 
 * @email 
 * @date 2021-04-26 10:06:05
 */
public interface MeirongxiangmuDao extends BaseMapper<MeirongxiangmuEntity> {
	
	List<MeirongxiangmuVO> selectListVO(@Param("ew") Wrapper<MeirongxiangmuEntity> wrapper);
	
	MeirongxiangmuVO selectVO(@Param("ew") Wrapper<MeirongxiangmuEntity> wrapper);
	
	List<MeirongxiangmuView> selectListView(@Param("ew") Wrapper<MeirongxiangmuEntity> wrapper);

	List<MeirongxiangmuView> selectListView(Pagination page,@Param("ew") Wrapper<MeirongxiangmuEntity> wrapper);
	
	MeirongxiangmuView selectView(@Param("ew") Wrapper<MeirongxiangmuEntity> wrapper);
	
}
