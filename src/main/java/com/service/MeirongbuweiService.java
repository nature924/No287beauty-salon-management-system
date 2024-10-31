package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MeirongbuweiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MeirongbuweiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MeirongbuweiView;


/**
 * 美容部位
 *
 * @author 
 * @email 
 * @date 2021-04-26 10:06:05
 */
public interface MeirongbuweiService extends IService<MeirongbuweiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MeirongbuweiVO> selectListVO(Wrapper<MeirongbuweiEntity> wrapper);
   	
   	MeirongbuweiVO selectVO(@Param("ew") Wrapper<MeirongbuweiEntity> wrapper);
   	
   	List<MeirongbuweiView> selectListView(Wrapper<MeirongbuweiEntity> wrapper);
   	
   	MeirongbuweiView selectView(@Param("ew") Wrapper<MeirongbuweiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MeirongbuweiEntity> wrapper);
   	
}

