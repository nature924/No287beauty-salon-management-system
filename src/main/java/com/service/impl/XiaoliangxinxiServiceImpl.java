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


import com.dao.XiaoliangxinxiDao;
import com.entity.XiaoliangxinxiEntity;
import com.service.XiaoliangxinxiService;
import com.entity.vo.XiaoliangxinxiVO;
import com.entity.view.XiaoliangxinxiView;

@Service("xiaoliangxinxiService")
public class XiaoliangxinxiServiceImpl extends ServiceImpl<XiaoliangxinxiDao, XiaoliangxinxiEntity> implements XiaoliangxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoliangxinxiEntity> page = this.selectPage(
                new Query<XiaoliangxinxiEntity>(params).getPage(),
                new EntityWrapper<XiaoliangxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoliangxinxiEntity> wrapper) {
		  Page<XiaoliangxinxiView> page =new Query<XiaoliangxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaoliangxinxiVO> selectListVO(Wrapper<XiaoliangxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaoliangxinxiVO selectVO(Wrapper<XiaoliangxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaoliangxinxiView> selectListView(Wrapper<XiaoliangxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoliangxinxiView selectView(Wrapper<XiaoliangxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
