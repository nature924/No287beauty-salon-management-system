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


import com.dao.JishiDao;
import com.entity.JishiEntity;
import com.service.JishiService;
import com.entity.vo.JishiVO;
import com.entity.view.JishiView;

@Service("jishiService")
public class JishiServiceImpl extends ServiceImpl<JishiDao, JishiEntity> implements JishiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JishiEntity> page = this.selectPage(
                new Query<JishiEntity>(params).getPage(),
                new EntityWrapper<JishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JishiEntity> wrapper) {
		  Page<JishiView> page =new Query<JishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JishiVO> selectListVO(Wrapper<JishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JishiVO selectVO(Wrapper<JishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JishiView> selectListView(Wrapper<JishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JishiView selectView(Wrapper<JishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
