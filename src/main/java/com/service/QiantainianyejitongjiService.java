package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QiantainianyejitongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QiantainianyejitongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QiantainianyejitongjiView;


/**
 * 前台年业绩统计
 *
 * @author 
 * @email 
 * @date 2021-04-26 10:06:06
 */
public interface QiantainianyejitongjiService extends IService<QiantainianyejitongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QiantainianyejitongjiVO> selectListVO(Wrapper<QiantainianyejitongjiEntity> wrapper);
   	
   	QiantainianyejitongjiVO selectVO(@Param("ew") Wrapper<QiantainianyejitongjiEntity> wrapper);
   	
   	List<QiantainianyejitongjiView> selectListView(Wrapper<QiantainianyejitongjiEntity> wrapper);
   	
   	QiantainianyejitongjiView selectView(@Param("ew") Wrapper<QiantainianyejitongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QiantainianyejitongjiEntity> wrapper);
   	
}

