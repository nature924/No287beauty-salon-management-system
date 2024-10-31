package com.dao;

import com.entity.QiantaiyueyejitongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QiantaiyueyejitongjiVO;
import com.entity.view.QiantaiyueyejitongjiView;


/**
 * 前台月业绩统计
 * 
 * @author 
 * @email 
 * @date 2021-04-26 10:06:06
 */
public interface QiantaiyueyejitongjiDao extends BaseMapper<QiantaiyueyejitongjiEntity> {
	
	List<QiantaiyueyejitongjiVO> selectListVO(@Param("ew") Wrapper<QiantaiyueyejitongjiEntity> wrapper);
	
	QiantaiyueyejitongjiVO selectVO(@Param("ew") Wrapper<QiantaiyueyejitongjiEntity> wrapper);
	
	List<QiantaiyueyejitongjiView> selectListView(@Param("ew") Wrapper<QiantaiyueyejitongjiEntity> wrapper);

	List<QiantaiyueyejitongjiView> selectListView(Pagination page,@Param("ew") Wrapper<QiantaiyueyejitongjiEntity> wrapper);
	
	QiantaiyueyejitongjiView selectView(@Param("ew") Wrapper<QiantaiyueyejitongjiEntity> wrapper);
	
}
