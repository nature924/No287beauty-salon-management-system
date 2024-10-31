package com.dao;

import com.entity.YonghuyuyuexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YonghuyuyuexinxiVO;
import com.entity.view.YonghuyuyuexinxiView;


/**
 * 用户预约信息
 * 
 * @author 
 * @email 
 * @date 2021-04-26 10:06:05
 */
public interface YonghuyuyuexinxiDao extends BaseMapper<YonghuyuyuexinxiEntity> {
	
	List<YonghuyuyuexinxiVO> selectListVO(@Param("ew") Wrapper<YonghuyuyuexinxiEntity> wrapper);
	
	YonghuyuyuexinxiVO selectVO(@Param("ew") Wrapper<YonghuyuyuexinxiEntity> wrapper);
	
	List<YonghuyuyuexinxiView> selectListView(@Param("ew") Wrapper<YonghuyuyuexinxiEntity> wrapper);

	List<YonghuyuyuexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<YonghuyuyuexinxiEntity> wrapper);
	
	YonghuyuyuexinxiView selectView(@Param("ew") Wrapper<YonghuyuyuexinxiEntity> wrapper);
	
}
