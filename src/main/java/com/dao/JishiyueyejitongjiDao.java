package com.dao;

import com.entity.JishiyueyejitongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JishiyueyejitongjiVO;
import com.entity.view.JishiyueyejitongjiView;


/**
 * 技师月业绩统计
 * 
 * @author 
 * @email 
 * @date 2021-04-26 10:06:06
 */
public interface JishiyueyejitongjiDao extends BaseMapper<JishiyueyejitongjiEntity> {
	
	List<JishiyueyejitongjiVO> selectListVO(@Param("ew") Wrapper<JishiyueyejitongjiEntity> wrapper);
	
	JishiyueyejitongjiVO selectVO(@Param("ew") Wrapper<JishiyueyejitongjiEntity> wrapper);
	
	List<JishiyueyejitongjiView> selectListView(@Param("ew") Wrapper<JishiyueyejitongjiEntity> wrapper);

	List<JishiyueyejitongjiView> selectListView(Pagination page,@Param("ew") Wrapper<JishiyueyejitongjiEntity> wrapper);
	
	JishiyueyejitongjiView selectView(@Param("ew") Wrapper<JishiyueyejitongjiEntity> wrapper);
	
}
