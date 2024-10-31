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


import com.dao.MeirongxiangmuDao;
import com.entity.MeirongxiangmuEntity;
import com.service.MeirongxiangmuService;
import com.entity.vo.MeirongxiangmuVO;
import com.entity.view.MeirongxiangmuView;

@Service("meirongxiangmuService")
public class MeirongxiangmuServiceImpl extends ServiceImpl<MeirongxiangmuDao, MeirongxiangmuEntity> implements MeirongxiangmuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MeirongxiangmuEntity> page = this.selectPage(
                new Query<MeirongxiangmuEntity>(params).getPage(),
                new EntityWrapper<MeirongxiangmuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MeirongxiangmuEntity> wrapper) {
		  Page<MeirongxiangmuView> page =new Query<MeirongxiangmuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MeirongxiangmuVO> selectListVO(Wrapper<MeirongxiangmuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MeirongxiangmuVO selectVO(Wrapper<MeirongxiangmuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MeirongxiangmuView> selectListView(Wrapper<MeirongxiangmuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MeirongxiangmuView selectView(Wrapper<MeirongxiangmuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
