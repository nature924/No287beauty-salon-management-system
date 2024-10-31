package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MeirongxiangmuyuetongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MeirongxiangmuyuetongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MeirongxiangmuyuetongjiView;


/**
 * 美容项目月统计
 *
 * @author 
 * @email 
 * @date 2021-04-26 10:06:05
 */
public interface MeirongxiangmuyuetongjiService extends IService<MeirongxiangmuyuetongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MeirongxiangmuyuetongjiVO> selectListVO(Wrapper<MeirongxiangmuyuetongjiEntity> wrapper);
   	
   	MeirongxiangmuyuetongjiVO selectVO(@Param("ew") Wrapper<MeirongxiangmuyuetongjiEntity> wrapper);
   	
   	List<MeirongxiangmuyuetongjiView> selectListView(Wrapper<MeirongxiangmuyuetongjiEntity> wrapper);
   	
   	MeirongxiangmuyuetongjiView selectView(@Param("ew") Wrapper<MeirongxiangmuyuetongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MeirongxiangmuyuetongjiEntity> wrapper);
   	
}

