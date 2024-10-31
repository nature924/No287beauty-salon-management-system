package com.dao;

import com.entity.XiaoliangxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaoliangxinxiVO;
import com.entity.view.XiaoliangxinxiView;


/**
 * 销量信息
 * 
 * @author 
 * @email 
 * @date 2021-04-26 10:06:05
 */
public interface XiaoliangxinxiDao extends BaseMapper<XiaoliangxinxiEntity> {
	
	List<XiaoliangxinxiVO> selectListVO(@Param("ew") Wrapper<XiaoliangxinxiEntity> wrapper);
	
	XiaoliangxinxiVO selectVO(@Param("ew") Wrapper<XiaoliangxinxiEntity> wrapper);
	
	List<XiaoliangxinxiView> selectListView(@Param("ew") Wrapper<XiaoliangxinxiEntity> wrapper);

	List<XiaoliangxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoliangxinxiEntity> wrapper);
	
	XiaoliangxinxiView selectView(@Param("ew") Wrapper<XiaoliangxinxiEntity> wrapper);
	
}
