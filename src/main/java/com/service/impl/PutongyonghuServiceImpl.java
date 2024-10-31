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


import com.dao.PutongyonghuDao;
import com.entity.PutongyonghuEntity;
import com.service.PutongyonghuService;
import com.entity.vo.PutongyonghuVO;
import com.entity.view.PutongyonghuView;

@Service("putongyonghuService")
public class PutongyonghuServiceImpl extends ServiceImpl<PutongyonghuDao, PutongyonghuEntity> implements PutongyonghuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PutongyonghuEntity> page = this.selectPage(
                new Query<PutongyonghuEntity>(params).getPage(),
                new EntityWrapper<PutongyonghuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PutongyonghuEntity> wrapper) {
		  Page<PutongyonghuView> page =new Query<PutongyonghuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PutongyonghuVO> selectListVO(Wrapper<PutongyonghuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PutongyonghuVO selectVO(Wrapper<PutongyonghuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PutongyonghuView> selectListView(Wrapper<PutongyonghuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PutongyonghuView selectView(Wrapper<PutongyonghuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
