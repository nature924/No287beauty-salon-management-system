package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonghuyuyuexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YonghuyuyuexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YonghuyuyuexinxiView;


/**
 * 用户预约信息
 *
 * @author 
 * @email 
 * @date 2021-04-26 10:06:05
 */
public interface YonghuyuyuexinxiService extends IService<YonghuyuyuexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YonghuyuyuexinxiVO> selectListVO(Wrapper<YonghuyuyuexinxiEntity> wrapper);
   	
   	YonghuyuyuexinxiVO selectVO(@Param("ew") Wrapper<YonghuyuyuexinxiEntity> wrapper);
   	
   	List<YonghuyuyuexinxiView> selectListView(Wrapper<YonghuyuyuexinxiEntity> wrapper);
   	
   	YonghuyuyuexinxiView selectView(@Param("ew") Wrapper<YonghuyuyuexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YonghuyuyuexinxiEntity> wrapper);
   	
}

