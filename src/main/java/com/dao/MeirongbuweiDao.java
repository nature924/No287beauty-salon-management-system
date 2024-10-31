package com.dao;

import com.entity.MeirongbuweiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MeirongbuweiVO;
import com.entity.view.MeirongbuweiView;


/**
 * 美容部位
 * 
 * @author 
 * @email 
 * @date 2021-04-26 10:06:05
 */
public interface MeirongbuweiDao extends BaseMapper<MeirongbuweiEntity> {
	
	List<MeirongbuweiVO> selectListVO(@Param("ew") Wrapper<MeirongbuweiEntity> wrapper);
	
	MeirongbuweiVO selectVO(@Param("ew") Wrapper<MeirongbuweiEntity> wrapper);
	
	List<MeirongbuweiView> selectListView(@Param("ew") Wrapper<MeirongbuweiEntity> wrapper);

	List<MeirongbuweiView> selectListView(Pagination page,@Param("ew") Wrapper<MeirongbuweiEntity> wrapper);
	
	MeirongbuweiView selectView(@Param("ew") Wrapper<MeirongbuweiEntity> wrapper);
	
}
