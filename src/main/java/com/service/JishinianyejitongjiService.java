package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JishinianyejitongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JishinianyejitongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JishinianyejitongjiView;


/**
 * 技师年业绩统计
 *
 * @author 
 * @email 
 * @date 2021-04-26 10:06:06
 */
public interface JishinianyejitongjiService extends IService<JishinianyejitongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JishinianyejitongjiVO> selectListVO(Wrapper<JishinianyejitongjiEntity> wrapper);
   	
   	JishinianyejitongjiVO selectVO(@Param("ew") Wrapper<JishinianyejitongjiEntity> wrapper);
   	
   	List<JishinianyejitongjiView> selectListView(Wrapper<JishinianyejitongjiEntity> wrapper);
   	
   	JishinianyejitongjiView selectView(@Param("ew") Wrapper<JishinianyejitongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JishinianyejitongjiEntity> wrapper);
   	
}

