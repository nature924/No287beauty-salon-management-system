package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MeirongxiangmuniantongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MeirongxiangmuniantongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MeirongxiangmuniantongjiView;


/**
 * 美容项目年统计
 *
 * @author 
 * @email 
 * @date 2021-04-26 10:06:05
 */
public interface MeirongxiangmuniantongjiService extends IService<MeirongxiangmuniantongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MeirongxiangmuniantongjiVO> selectListVO(Wrapper<MeirongxiangmuniantongjiEntity> wrapper);
   	
   	MeirongxiangmuniantongjiVO selectVO(@Param("ew") Wrapper<MeirongxiangmuniantongjiEntity> wrapper);
   	
   	List<MeirongxiangmuniantongjiView> selectListView(Wrapper<MeirongxiangmuniantongjiEntity> wrapper);
   	
   	MeirongxiangmuniantongjiView selectView(@Param("ew") Wrapper<MeirongxiangmuniantongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MeirongxiangmuniantongjiEntity> wrapper);
   	
}

