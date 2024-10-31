package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JishiyueyejitongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JishiyueyejitongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JishiyueyejitongjiView;


/**
 * 技师月业绩统计
 *
 * @author 
 * @email 
 * @date 2021-04-26 10:06:06
 */
public interface JishiyueyejitongjiService extends IService<JishiyueyejitongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JishiyueyejitongjiVO> selectListVO(Wrapper<JishiyueyejitongjiEntity> wrapper);
   	
   	JishiyueyejitongjiVO selectVO(@Param("ew") Wrapper<JishiyueyejitongjiEntity> wrapper);
   	
   	List<JishiyueyejitongjiView> selectListView(Wrapper<JishiyueyejitongjiEntity> wrapper);
   	
   	JishiyueyejitongjiView selectView(@Param("ew") Wrapper<JishiyueyejitongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JishiyueyejitongjiEntity> wrapper);
   	
}

