package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyuanyuyuexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyuanyuyuexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyuanyuyuexinxiView;


/**
 * 会员预约信息
 *
 * @author 
 * @email 
 * @date 2021-04-26 10:06:05
 */
public interface HuiyuanyuyuexinxiService extends IService<HuiyuanyuyuexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyuanyuyuexinxiVO> selectListVO(Wrapper<HuiyuanyuyuexinxiEntity> wrapper);
   	
   	HuiyuanyuyuexinxiVO selectVO(@Param("ew") Wrapper<HuiyuanyuyuexinxiEntity> wrapper);
   	
   	List<HuiyuanyuyuexinxiView> selectListView(Wrapper<HuiyuanyuyuexinxiEntity> wrapper);
   	
   	HuiyuanyuyuexinxiView selectView(@Param("ew") Wrapper<HuiyuanyuyuexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyuanyuyuexinxiEntity> wrapper);
   	
}

