package com.dao;

import com.entity.MeirongyongpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MeirongyongpinVO;
import com.entity.view.MeirongyongpinView;


/**
 * 美容用品
 * 
 * @author 
 * @email 
 * @date 2021-04-26 10:06:05
 */
public interface MeirongyongpinDao extends BaseMapper<MeirongyongpinEntity> {
	
	List<MeirongyongpinVO> selectListVO(@Param("ew") Wrapper<MeirongyongpinEntity> wrapper);
	
	MeirongyongpinVO selectVO(@Param("ew") Wrapper<MeirongyongpinEntity> wrapper);
	
	List<MeirongyongpinView> selectListView(@Param("ew") Wrapper<MeirongyongpinEntity> wrapper);

	List<MeirongyongpinView> selectListView(Pagination page,@Param("ew") Wrapper<MeirongyongpinEntity> wrapper);
	
	MeirongyongpinView selectView(@Param("ew") Wrapper<MeirongyongpinEntity> wrapper);
	
}
