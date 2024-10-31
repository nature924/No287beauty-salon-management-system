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


import com.dao.MeirongbuweiDao;
import com.entity.MeirongbuweiEntity;
import com.service.MeirongbuweiService;
import com.entity.vo.MeirongbuweiVO;
import com.entity.view.MeirongbuweiView;

@Service("meirongbuweiService")
public class MeirongbuweiServiceImpl extends ServiceImpl<MeirongbuweiDao, MeirongbuweiEntity> implements MeirongbuweiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MeirongbuweiEntity> page = this.selectPage(
                new Query<MeirongbuweiEntity>(params).getPage(),
                new EntityWrapper<MeirongbuweiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MeirongbuweiEntity> wrapper) {
		  Page<MeirongbuweiView> page =new Query<MeirongbuweiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MeirongbuweiVO> selectListVO(Wrapper<MeirongbuweiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MeirongbuweiVO selectVO(Wrapper<MeirongbuweiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MeirongbuweiView> selectListView(Wrapper<MeirongbuweiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MeirongbuweiView selectView(Wrapper<MeirongbuweiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
