package com.dao;

import com.entity.KucunxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KucunxinxiVO;
import com.entity.view.KucunxinxiView;


/**
 * 库存信息
 * 
 * @author 
 * @email 
 * @date 2021-04-26 10:06:05
 */
public interface KucunxinxiDao extends BaseMapper<KucunxinxiEntity> {
	
	List<KucunxinxiVO> selectListVO(@Param("ew") Wrapper<KucunxinxiEntity> wrapper);
	
	KucunxinxiVO selectVO(@Param("ew") Wrapper<KucunxinxiEntity> wrapper);
	
	List<KucunxinxiView> selectListView(@Param("ew") Wrapper<KucunxinxiEntity> wrapper);

	List<KucunxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<KucunxinxiEntity> wrapper);
	
	KucunxinxiView selectView(@Param("ew") Wrapper<KucunxinxiEntity> wrapper);
	
}
