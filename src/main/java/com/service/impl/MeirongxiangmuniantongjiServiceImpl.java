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


import com.dao.MeirongxiangmuniantongjiDao;
import com.entity.MeirongxiangmuniantongjiEntity;
import com.service.MeirongxiangmuniantongjiService;
import com.entity.vo.MeirongxiangmuniantongjiVO;
import com.entity.view.MeirongxiangmuniantongjiView;

@Service("meirongxiangmuniantongjiService")
public class MeirongxiangmuniantongjiServiceImpl extends ServiceImpl<MeirongxiangmuniantongjiDao, MeirongxiangmuniantongjiEntity> implements MeirongxiangmuniantongjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MeirongxiangmuniantongjiEntity> page = this.selectPage(
                new Query<MeirongxiangmuniantongjiEntity>(params).getPage(),
                new EntityWrapper<MeirongxiangmuniantongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MeirongxiangmuniantongjiEntity> wrapper) {
		  Page<MeirongxiangmuniantongjiView> page =new Query<MeirongxiangmuniantongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MeirongxiangmuniantongjiVO> selectListVO(Wrapper<MeirongxiangmuniantongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MeirongxiangmuniantongjiVO selectVO(Wrapper<MeirongxiangmuniantongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MeirongxiangmuniantongjiView> selectListView(Wrapper<MeirongxiangmuniantongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MeirongxiangmuniantongjiView selectView(Wrapper<MeirongxiangmuniantongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
