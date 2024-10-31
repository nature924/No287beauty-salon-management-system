package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyuanyuexiaofeixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyuanyuexiaofeixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyuanyuexiaofeixinxiView;


/**
 * 会员月消费信息
 *
 * @author 
 * @email 
 * @date 2021-04-26 10:06:06
 */
public interface HuiyuanyuexiaofeixinxiService extends IService<HuiyuanyuexiaofeixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyuanyuexiaofeixinxiVO> selectListVO(Wrapper<HuiyuanyuexiaofeixinxiEntity> wrapper);
   	
   	HuiyuanyuexiaofeixinxiVO selectVO(@Param("ew") Wrapper<HuiyuanyuexiaofeixinxiEntity> wrapper);
   	
   	List<HuiyuanyuexiaofeixinxiView> selectListView(Wrapper<HuiyuanyuexiaofeixinxiEntity> wrapper);
   	
   	HuiyuanyuexiaofeixinxiView selectView(@Param("ew") Wrapper<HuiyuanyuexiaofeixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyuanyuexiaofeixinxiEntity> wrapper);
   	
}

