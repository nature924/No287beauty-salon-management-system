package com.dao;

import com.entity.JishinianyejitongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JishinianyejitongjiVO;
import com.entity.view.JishinianyejitongjiView;


/**
 * 技师年业绩统计
 * 
 * @author 
 * @email 
 * @date 2021-04-26 10:06:06
 */
public interface JishinianyejitongjiDao extends BaseMapper<JishinianyejitongjiEntity> {
	
	List<JishinianyejitongjiVO> selectListVO(@Param("ew") Wrapper<JishinianyejitongjiEntity> wrapper);
	
	JishinianyejitongjiVO selectVO(@Param("ew") Wrapper<JishinianyejitongjiEntity> wrapper);
	
	List<JishinianyejitongjiView> selectListView(@Param("ew") Wrapper<JishinianyejitongjiEntity> wrapper);

	List<JishinianyejitongjiView> selectListView(Pagination page,@Param("ew") Wrapper<JishinianyejitongjiEntity> wrapper);
	
	JishinianyejitongjiView selectView(@Param("ew") Wrapper<JishinianyejitongjiEntity> wrapper);
	
}
