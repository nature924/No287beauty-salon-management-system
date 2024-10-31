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


import com.dao.MeirongyongpinDao;
import com.entity.MeirongyongpinEntity;
import com.service.MeirongyongpinService;
import com.entity.vo.MeirongyongpinVO;
import com.entity.view.MeirongyongpinView;

@Service("meirongyongpinService")
public class MeirongyongpinServiceImpl extends ServiceImpl<MeirongyongpinDao, MeirongyongpinEntity> implements MeirongyongpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MeirongyongpinEntity> page = this.selectPage(
                new Query<MeirongyongpinEntity>(params).getPage(),
                new EntityWrapper<MeirongyongpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MeirongyongpinEntity> wrapper) {
		  Page<MeirongyongpinView> page =new Query<MeirongyongpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MeirongyongpinVO> selectListVO(Wrapper<MeirongyongpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MeirongyongpinVO selectVO(Wrapper<MeirongyongpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MeirongyongpinView> selectListView(Wrapper<MeirongyongpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MeirongyongpinView selectView(Wrapper<MeirongyongpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
