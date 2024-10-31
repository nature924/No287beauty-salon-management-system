package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MeirongxiangmuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MeirongxiangmuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MeirongxiangmuView;


/**
 * 美容项目
 *
 * @author 
 * @email 
 * @date 2021-04-26 10:06:05
 */
public interface MeirongxiangmuService extends IService<MeirongxiangmuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MeirongxiangmuVO> selectListVO(Wrapper<MeirongxiangmuEntity> wrapper);
   	
   	MeirongxiangmuVO selectVO(@Param("ew") Wrapper<MeirongxiangmuEntity> wrapper);
   	
   	List<MeirongxiangmuView> selectListView(Wrapper<MeirongxiangmuEntity> wrapper);
   	
   	MeirongxiangmuView selectView(@Param("ew") Wrapper<MeirongxiangmuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MeirongxiangmuEntity> wrapper);
   	
}

