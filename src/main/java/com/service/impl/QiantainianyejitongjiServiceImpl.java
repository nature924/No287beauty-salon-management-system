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


import com.dao.QiantainianyejitongjiDao;
import com.entity.QiantainianyejitongjiEntity;
import com.service.QiantainianyejitongjiService;
import com.entity.vo.QiantainianyejitongjiVO;
import com.entity.view.QiantainianyejitongjiView;

@Service("qiantainianyejitongjiService")
public class QiantainianyejitongjiServiceImpl extends ServiceImpl<QiantainianyejitongjiDao, QiantainianyejitongjiEntity> implements QiantainianyejitongjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QiantainianyejitongjiEntity> page = this.selectPage(
                new Query<QiantainianyejitongjiEntity>(params).getPage(),
                new EntityWrapper<QiantainianyejitongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QiantainianyejitongjiEntity> wrapper) {
		  Page<QiantainianyejitongjiView> page =new Query<QiantainianyejitongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QiantainianyejitongjiVO> selectListVO(Wrapper<QiantainianyejitongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QiantainianyejitongjiVO selectVO(Wrapper<QiantainianyejitongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QiantainianyejitongjiView> selectListView(Wrapper<QiantainianyejitongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QiantainianyejitongjiView selectView(Wrapper<QiantainianyejitongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
