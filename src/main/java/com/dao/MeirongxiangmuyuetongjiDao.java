package com.dao;

import com.entity.MeirongxiangmuyuetongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MeirongxiangmuyuetongjiVO;
import com.entity.view.MeirongxiangmuyuetongjiView;


/**
 * 美容项目月统计
 * 
 * @author 
 * @email 
 * @date 2021-04-26 10:06:05
 */
public interface MeirongxiangmuyuetongjiDao extends BaseMapper<MeirongxiangmuyuetongjiEntity> {
	
	List<MeirongxiangmuyuetongjiVO> selectListVO(@Param("ew") Wrapper<MeirongxiangmuyuetongjiEntity> wrapper);
	
	MeirongxiangmuyuetongjiVO selectVO(@Param("ew") Wrapper<MeirongxiangmuyuetongjiEntity> wrapper);
	
	List<MeirongxiangmuyuetongjiView> selectListView(@Param("ew") Wrapper<MeirongxiangmuyuetongjiEntity> wrapper);

	List<MeirongxiangmuyuetongjiView> selectListView(Pagination page,@Param("ew") Wrapper<MeirongxiangmuyuetongjiEntity> wrapper);
	
	MeirongxiangmuyuetongjiView selectView(@Param("ew") Wrapper<MeirongxiangmuyuetongjiEntity> wrapper);
	
}
