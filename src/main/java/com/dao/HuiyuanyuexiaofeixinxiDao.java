package com.dao;

import com.entity.HuiyuanyuexiaofeixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyuanyuexiaofeixinxiVO;
import com.entity.view.HuiyuanyuexiaofeixinxiView;


/**
 * 会员月消费信息
 * 
 * @author 
 * @email 
 * @date 2021-04-26 10:06:06
 */
public interface HuiyuanyuexiaofeixinxiDao extends BaseMapper<HuiyuanyuexiaofeixinxiEntity> {
	
	List<HuiyuanyuexiaofeixinxiVO> selectListVO(@Param("ew") Wrapper<HuiyuanyuexiaofeixinxiEntity> wrapper);
	
	HuiyuanyuexiaofeixinxiVO selectVO(@Param("ew") Wrapper<HuiyuanyuexiaofeixinxiEntity> wrapper);
	
	List<HuiyuanyuexiaofeixinxiView> selectListView(@Param("ew") Wrapper<HuiyuanyuexiaofeixinxiEntity> wrapper);

	List<HuiyuanyuexiaofeixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyuanyuexiaofeixinxiEntity> wrapper);
	
	HuiyuanyuexiaofeixinxiView selectView(@Param("ew") Wrapper<HuiyuanyuexiaofeixinxiEntity> wrapper);
	
}
