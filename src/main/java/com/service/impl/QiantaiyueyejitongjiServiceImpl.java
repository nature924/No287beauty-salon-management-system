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


import com.dao.QiantaiyueyejitongjiDao;
import com.entity.QiantaiyueyejitongjiEntity;
import com.service.QiantaiyueyejitongjiService;
import com.entity.vo.QiantaiyueyejitongjiVO;
import com.entity.view.QiantaiyueyejitongjiView;

@Service("qiantaiyueyejitongjiService")
public class QiantaiyueyejitongjiServiceImpl extends ServiceImpl<QiantaiyueyejitongjiDao, QiantaiyueyejitongjiEntity> implements QiantaiyueyejitongjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QiantaiyueyejitongjiEntity> page = this.selectPage(
                new Query<QiantaiyueyejitongjiEntity>(params).getPage(),
                new EntityWrapper<QiantaiyueyejitongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QiantaiyueyejitongjiEntity> wrapper) {
		  Page<QiantaiyueyejitongjiView> page =new Query<QiantaiyueyejitongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QiantaiyueyejitongjiVO> selectListVO(Wrapper<QiantaiyueyejitongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QiantaiyueyejitongjiVO selectVO(Wrapper<QiantaiyueyejitongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QiantaiyueyejitongjiView> selectListView(Wrapper<QiantaiyueyejitongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QiantaiyueyejitongjiView selectView(Wrapper<QiantaiyueyejitongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
