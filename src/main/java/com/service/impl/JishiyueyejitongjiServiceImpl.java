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


import com.dao.JishiyueyejitongjiDao;
import com.entity.JishiyueyejitongjiEntity;
import com.service.JishiyueyejitongjiService;
import com.entity.vo.JishiyueyejitongjiVO;
import com.entity.view.JishiyueyejitongjiView;

@Service("jishiyueyejitongjiService")
public class JishiyueyejitongjiServiceImpl extends ServiceImpl<JishiyueyejitongjiDao, JishiyueyejitongjiEntity> implements JishiyueyejitongjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JishiyueyejitongjiEntity> page = this.selectPage(
                new Query<JishiyueyejitongjiEntity>(params).getPage(),
                new EntityWrapper<JishiyueyejitongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JishiyueyejitongjiEntity> wrapper) {
		  Page<JishiyueyejitongjiView> page =new Query<JishiyueyejitongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JishiyueyejitongjiVO> selectListVO(Wrapper<JishiyueyejitongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JishiyueyejitongjiVO selectVO(Wrapper<JishiyueyejitongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JishiyueyejitongjiView> selectListView(Wrapper<JishiyueyejitongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JishiyueyejitongjiView selectView(Wrapper<JishiyueyejitongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
