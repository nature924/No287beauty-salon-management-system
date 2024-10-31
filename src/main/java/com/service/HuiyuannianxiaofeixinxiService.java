package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyuannianxiaofeixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyuannianxiaofeixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyuannianxiaofeixinxiView;


/**
 * 会员年消费信息
 *
 * @author 
 * @email 
 * @date 2021-04-26 10:06:06
 */
public interface HuiyuannianxiaofeixinxiService extends IService<HuiyuannianxiaofeixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyuannianxiaofeixinxiVO> selectListVO(Wrapper<HuiyuannianxiaofeixinxiEntity> wrapper);
   	
   	HuiyuannianxiaofeixinxiVO selectVO(@Param("ew") Wrapper<HuiyuannianxiaofeixinxiEntity> wrapper);
   	
   	List<HuiyuannianxiaofeixinxiView> selectListView(Wrapper<HuiyuannianxiaofeixinxiEntity> wrapper);
   	
   	HuiyuannianxiaofeixinxiView selectView(@Param("ew") Wrapper<HuiyuannianxiaofeixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyuannianxiaofeixinxiEntity> wrapper);
   	
}

