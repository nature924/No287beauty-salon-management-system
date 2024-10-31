package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QiantaiyueyejitongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QiantaiyueyejitongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QiantaiyueyejitongjiView;


/**
 * 前台月业绩统计
 *
 * @author 
 * @email 
 * @date 2021-04-26 10:06:06
 */
public interface QiantaiyueyejitongjiService extends IService<QiantaiyueyejitongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QiantaiyueyejitongjiVO> selectListVO(Wrapper<QiantaiyueyejitongjiEntity> wrapper);
   	
   	QiantaiyueyejitongjiVO selectVO(@Param("ew") Wrapper<QiantaiyueyejitongjiEntity> wrapper);
   	
   	List<QiantaiyueyejitongjiView> selectListView(Wrapper<QiantaiyueyejitongjiEntity> wrapper);
   	
   	QiantaiyueyejitongjiView selectView(@Param("ew") Wrapper<QiantaiyueyejitongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QiantaiyueyejitongjiEntity> wrapper);
   	
}

