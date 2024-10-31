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


import com.dao.MeirongxiangmuyuetongjiDao;
import com.entity.MeirongxiangmuyuetongjiEntity;
import com.service.MeirongxiangmuyuetongjiService;
import com.entity.vo.MeirongxiangmuyuetongjiVO;
import com.entity.view.MeirongxiangmuyuetongjiView;

@Service("meirongxiangmuyuetongjiService")
public class MeirongxiangmuyuetongjiServiceImpl extends ServiceImpl<MeirongxiangmuyuetongjiDao, MeirongxiangmuyuetongjiEntity> implements MeirongxiangmuyuetongjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MeirongxiangmuyuetongjiEntity> page = this.selectPage(
                new Query<MeirongxiangmuyuetongjiEntity>(params).getPage(),
                new EntityWrapper<MeirongxiangmuyuetongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MeirongxiangmuyuetongjiEntity> wrapper) {
		  Page<MeirongxiangmuyuetongjiView> page =new Query<MeirongxiangmuyuetongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MeirongxiangmuyuetongjiVO> selectListVO(Wrapper<MeirongxiangmuyuetongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MeirongxiangmuyuetongjiVO selectVO(Wrapper<MeirongxiangmuyuetongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MeirongxiangmuyuetongjiView> selectListView(Wrapper<MeirongxiangmuyuetongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MeirongxiangmuyuetongjiView selectView(Wrapper<MeirongxiangmuyuetongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
