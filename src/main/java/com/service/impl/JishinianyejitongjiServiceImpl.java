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


import com.dao.JishinianyejitongjiDao;
import com.entity.JishinianyejitongjiEntity;
import com.service.JishinianyejitongjiService;
import com.entity.vo.JishinianyejitongjiVO;
import com.entity.view.JishinianyejitongjiView;

@Service("jishinianyejitongjiService")
public class JishinianyejitongjiServiceImpl extends ServiceImpl<JishinianyejitongjiDao, JishinianyejitongjiEntity> implements JishinianyejitongjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JishinianyejitongjiEntity> page = this.selectPage(
                new Query<JishinianyejitongjiEntity>(params).getPage(),
                new EntityWrapper<JishinianyejitongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JishinianyejitongjiEntity> wrapper) {
		  Page<JishinianyejitongjiView> page =new Query<JishinianyejitongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JishinianyejitongjiVO> selectListVO(Wrapper<JishinianyejitongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JishinianyejitongjiVO selectVO(Wrapper<JishinianyejitongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JishinianyejitongjiView> selectListView(Wrapper<JishinianyejitongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JishinianyejitongjiView selectView(Wrapper<JishinianyejitongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
