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


import com.dao.YonghuyuexiaofeixinxiDao;
import com.entity.YonghuyuexiaofeixinxiEntity;
import com.service.YonghuyuexiaofeixinxiService;
import com.entity.vo.YonghuyuexiaofeixinxiVO;
import com.entity.view.YonghuyuexiaofeixinxiView;

@Service("yonghuyuexiaofeixinxiService")
public class YonghuyuexiaofeixinxiServiceImpl extends ServiceImpl<YonghuyuexiaofeixinxiDao, YonghuyuexiaofeixinxiEntity> implements YonghuyuexiaofeixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YonghuyuexiaofeixinxiEntity> page = this.selectPage(
                new Query<YonghuyuexiaofeixinxiEntity>(params).getPage(),
                new EntityWrapper<YonghuyuexiaofeixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YonghuyuexiaofeixinxiEntity> wrapper) {
		  Page<YonghuyuexiaofeixinxiView> page =new Query<YonghuyuexiaofeixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YonghuyuexiaofeixinxiVO> selectListVO(Wrapper<YonghuyuexiaofeixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YonghuyuexiaofeixinxiVO selectVO(Wrapper<YonghuyuexiaofeixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YonghuyuexiaofeixinxiView> selectListView(Wrapper<YonghuyuexiaofeixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YonghuyuexiaofeixinxiView selectView(Wrapper<YonghuyuexiaofeixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
