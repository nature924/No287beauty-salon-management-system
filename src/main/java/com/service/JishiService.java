package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JishiView;


/**
 * 技师
 *
 * @author 
 * @email 
 * @date 2021-04-26 10:06:05
 */
public interface JishiService extends IService<JishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JishiVO> selectListVO(Wrapper<JishiEntity> wrapper);
   	
   	JishiVO selectVO(@Param("ew") Wrapper<JishiEntity> wrapper);
   	
   	List<JishiView> selectListView(Wrapper<JishiEntity> wrapper);
   	
   	JishiView selectView(@Param("ew") Wrapper<JishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JishiEntity> wrapper);
   	
}

