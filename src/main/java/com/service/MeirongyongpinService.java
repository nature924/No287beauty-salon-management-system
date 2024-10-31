package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MeirongyongpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MeirongyongpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MeirongyongpinView;


/**
 * 美容用品
 *
 * @author 
 * @email 
 * @date 2021-04-26 10:06:05
 */
public interface MeirongyongpinService extends IService<MeirongyongpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MeirongyongpinVO> selectListVO(Wrapper<MeirongyongpinEntity> wrapper);
   	
   	MeirongyongpinVO selectVO(@Param("ew") Wrapper<MeirongyongpinEntity> wrapper);
   	
   	List<MeirongyongpinView> selectListView(Wrapper<MeirongyongpinEntity> wrapper);
   	
   	MeirongyongpinView selectView(@Param("ew") Wrapper<MeirongyongpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MeirongyongpinEntity> wrapper);
   	
}

