package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YonghunianxiaofeixinxiDao;
import com.entity.YonghunianxiaofeixinxiEntity;
import com.service.YonghunianxiaofeixinxiService;
import com.entity.vo.YonghunianxiaofeixinxiVO;
import com.entity.view.YonghunianxiaofeixinxiView;

@Service("yonghunianxiaofeixinxiService")
public class YonghunianxiaofeixinxiServiceImpl extends ServiceImpl<YonghunianxiaofeixinxiDao, YonghunianxiaofeixinxiEntity> implements YonghunianxiaofeixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YonghunianxiaofeixinxiEntity> page = this.selectPage(
                new Query<YonghunianxiaofeixinxiEntity>(params).getPage(),
                new EntityWrapper<YonghunianxiaofeixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YonghunianxiaofeixinxiEntity> wrapper) {
		  Page<YonghunianxiaofeixinxiView> page =new Query<YonghunianxiaofeixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YonghunianxiaofeixinxiVO> selectListVO(Wrapper<YonghunianxiaofeixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YonghunianxiaofeixinxiVO selectVO(Wrapper<YonghunianxiaofeixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YonghunianxiaofeixinxiView> selectListView(Wrapper<YonghunianxiaofeixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YonghunianxiaofeixinxiView selectView(Wrapper<YonghunianxiaofeixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
