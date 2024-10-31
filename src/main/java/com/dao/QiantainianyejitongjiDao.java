package com.dao;

import com.entity.QiantainianyejitongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QiantainianyejitongjiVO;
import com.entity.view.QiantainianyejitongjiView;


/**
 * 前台年业绩统计
 * 
 * @author 
 * @email 
 * @date 2021-04-26 10:06:06
 */
public interface QiantainianyejitongjiDao extends BaseMapper<QiantainianyejitongjiEntity> {
	
	List<QiantainianyejitongjiVO> selectListVO(@Param("ew") Wrapper<QiantainianyejitongjiEntity> wrapper);
	
	QiantainianyejitongjiVO selectVO(@Param("ew") Wrapper<QiantainianyejitongjiEntity> wrapper);
	
	List<QiantainianyejitongjiView> selectListView(@Param("ew") Wrapper<QiantainianyejitongjiEntity> wrapper);

	List<QiantainianyejitongjiView> selectListView(Pagination page,@Param("ew") Wrapper<QiantainianyejitongjiEntity> wrapper);
	
	QiantainianyejitongjiView selectView(@Param("ew") Wrapper<QiantainianyejitongjiEntity> wrapper);
	
}
