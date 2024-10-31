package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonghunianxiaofeixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YonghunianxiaofeixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YonghunianxiaofeixinxiView;


/**
 * 用户年消费信息
 *
 * @author 
 * @email 
 * @date 2021-04-26 10:06:06
 */
public interface YonghunianxiaofeixinxiService extends IService<YonghunianxiaofeixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YonghunianxiaofeixinxiVO> selectListVO(Wrapper<YonghunianxiaofeixinxiEntity> wrapper);
   	
   	YonghunianxiaofeixinxiVO selectVO(@Param("ew") Wrapper<YonghunianxiaofeixinxiEntity> wrapper);
   	
   	List<YonghunianxiaofeixinxiView> selectListView(Wrapper<YonghunianxiaofeixinxiEntity> wrapper);
   	
   	YonghunianxiaofeixinxiView selectView(@Param("ew") Wrapper<YonghunianxiaofeixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YonghunianxiaofeixinxiEntity> wrapper);
   	
}

