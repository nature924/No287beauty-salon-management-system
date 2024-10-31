package com.dao;

import com.entity.HuiyuannianxiaofeixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyuannianxiaofeixinxiVO;
import com.entity.view.HuiyuannianxiaofeixinxiView;


/**
 * 会员年消费信息
 * 
 * @author 
 * @email 
 * @date 2021-04-26 10:06:06
 */
public interface HuiyuannianxiaofeixinxiDao extends BaseMapper<HuiyuannianxiaofeixinxiEntity> {
	
	List<HuiyuannianxiaofeixinxiVO> selectListVO(@Param("ew") Wrapper<HuiyuannianxiaofeixinxiEntity> wrapper);
	
	HuiyuannianxiaofeixinxiVO selectVO(@Param("ew") Wrapper<HuiyuannianxiaofeixinxiEntity> wrapper);
	
	List<HuiyuannianxiaofeixinxiView> selectListView(@Param("ew") Wrapper<HuiyuannianxiaofeixinxiEntity> wrapper);

	List<HuiyuannianxiaofeixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyuannianxiaofeixinxiEntity> wrapper);
	
	HuiyuannianxiaofeixinxiView selectView(@Param("ew") Wrapper<HuiyuannianxiaofeixinxiEntity> wrapper);
	
}
