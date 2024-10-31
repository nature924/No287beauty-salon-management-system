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


import com.dao.YonghuyuyuexinxiDao;
import com.entity.YonghuyuyuexinxiEntity;
import com.service.YonghuyuyuexinxiService;
import com.entity.vo.YonghuyuyuexinxiVO;
import com.entity.view.YonghuyuyuexinxiView;

@Service("yonghuyuyuexinxiService")
public class YonghuyuyuexinxiServiceImpl extends ServiceImpl<YonghuyuyuexinxiDao, YonghuyuyuexinxiEntity> implements YonghuyuyuexinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YonghuyuyuexinxiEntity> page = this.selectPage(
                new Query<YonghuyuyuexinxiEntity>(params).getPage(),
                new EntityWrapper<YonghuyuyuexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YonghuyuyuexinxiEntity> wrapper) {
		  Page<YonghuyuyuexinxiView> page =new Query<YonghuyuyuexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YonghuyuyuexinxiVO> selectListVO(Wrapper<YonghuyuyuexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YonghuyuyuexinxiVO selectVO(Wrapper<YonghuyuyuexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YonghuyuyuexinxiView> selectListView(Wrapper<YonghuyuyuexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YonghuyuyuexinxiView selectView(Wrapper<YonghuyuyuexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
