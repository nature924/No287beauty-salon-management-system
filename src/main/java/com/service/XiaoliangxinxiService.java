package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoliangxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoliangxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoliangxinxiView;


/**
 * 销量信息
 *
 * @author 
 * @email 
 * @date 2021-04-26 10:06:05
 */
public interface XiaoliangxinxiService extends IService<XiaoliangxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoliangxinxiVO> selectListVO(Wrapper<XiaoliangxinxiEntity> wrapper);
   	
   	XiaoliangxinxiVO selectVO(@Param("ew") Wrapper<XiaoliangxinxiEntity> wrapper);
   	
   	List<XiaoliangxinxiView> selectListView(Wrapper<XiaoliangxinxiEntity> wrapper);
   	
   	XiaoliangxinxiView selectView(@Param("ew") Wrapper<XiaoliangxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoliangxinxiEntity> wrapper);
   	
}

