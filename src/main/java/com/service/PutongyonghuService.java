package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PutongyonghuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PutongyonghuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PutongyonghuView;


/**
 * 普通用户
 *
 * @author 
 * @email 
 * @date 2021-04-26 10:06:05
 */
public interface PutongyonghuService extends IService<PutongyonghuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PutongyonghuVO> selectListVO(Wrapper<PutongyonghuEntity> wrapper);
   	
   	PutongyonghuVO selectVO(@Param("ew") Wrapper<PutongyonghuEntity> wrapper);
   	
   	List<PutongyonghuView> selectListView(Wrapper<PutongyonghuEntity> wrapper);
   	
   	PutongyonghuView selectView(@Param("ew") Wrapper<PutongyonghuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PutongyonghuEntity> wrapper);
   	
}

