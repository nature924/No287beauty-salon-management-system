package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KucunxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KucunxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KucunxinxiView;


/**
 * 库存信息
 *
 * @author 
 * @email 
 * @date 2021-04-26 10:06:05
 */
public interface KucunxinxiService extends IService<KucunxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KucunxinxiVO> selectListVO(Wrapper<KucunxinxiEntity> wrapper);
   	
   	KucunxinxiVO selectVO(@Param("ew") Wrapper<KucunxinxiEntity> wrapper);
   	
   	List<KucunxinxiView> selectListView(Wrapper<KucunxinxiEntity> wrapper);
   	
   	KucunxinxiView selectView(@Param("ew") Wrapper<KucunxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KucunxinxiEntity> wrapper);
   	
}

