package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonghuyuexiaofeixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YonghuyuexiaofeixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YonghuyuexiaofeixinxiView;


/**
 * 用户月消费信息
 *
 * @author 
 * @email 
 * @date 2021-04-26 10:06:06
 */
public interface YonghuyuexiaofeixinxiService extends IService<YonghuyuexiaofeixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YonghuyuexiaofeixinxiVO> selectListVO(Wrapper<YonghuyuexiaofeixinxiEntity> wrapper);
   	
   	YonghuyuexiaofeixinxiVO selectVO(@Param("ew") Wrapper<YonghuyuexiaofeixinxiEntity> wrapper);
   	
   	List<YonghuyuexiaofeixinxiView> selectListView(Wrapper<YonghuyuexiaofeixinxiEntity> wrapper);
   	
   	YonghuyuexiaofeixinxiView selectView(@Param("ew") Wrapper<YonghuyuexiaofeixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YonghuyuexiaofeixinxiEntity> wrapper);
   	
}

