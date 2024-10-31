package com.dao;

import com.entity.HuiyuanyuyuexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyuanyuyuexinxiVO;
import com.entity.view.HuiyuanyuyuexinxiView;


/**
 * 会员预约信息
 * 
 * @author 
 * @email 
 * @date 2021-04-26 10:06:05
 */
public interface HuiyuanyuyuexinxiDao extends BaseMapper<HuiyuanyuyuexinxiEntity> {
	
	List<HuiyuanyuyuexinxiVO> selectListVO(@Param("ew") Wrapper<HuiyuanyuyuexinxiEntity> wrapper);
	
	HuiyuanyuyuexinxiVO selectVO(@Param("ew") Wrapper<HuiyuanyuyuexinxiEntity> wrapper);
	
	List<HuiyuanyuyuexinxiView> selectListView(@Param("ew") Wrapper<HuiyuanyuyuexinxiEntity> wrapper);

	List<HuiyuanyuyuexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyuanyuyuexinxiEntity> wrapper);
	
	HuiyuanyuyuexinxiView selectView(@Param("ew") Wrapper<HuiyuanyuyuexinxiEntity> wrapper);
	
}
