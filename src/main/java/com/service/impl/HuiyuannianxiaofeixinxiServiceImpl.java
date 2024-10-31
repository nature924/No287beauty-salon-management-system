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


import com.dao.HuiyuannianxiaofeixinxiDao;
import com.entity.HuiyuannianxiaofeixinxiEntity;
import com.service.HuiyuannianxiaofeixinxiService;
import com.entity.vo.HuiyuannianxiaofeixinxiVO;
import com.entity.view.HuiyuannianxiaofeixinxiView;

@Service("huiyuannianxiaofeixinxiService")
public class HuiyuannianxiaofeixinxiServiceImpl extends ServiceImpl<HuiyuannianxiaofeixinxiDao, HuiyuannianxiaofeixinxiEntity> implements HuiyuannianxiaofeixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyuannianxiaofeixinxiEntity> page = this.selectPage(
                new Query<HuiyuannianxiaofeixinxiEntity>(params).getPage(),
                new EntityWrapper<HuiyuannianxiaofeixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyuannianxiaofeixinxiEntity> wrapper) {
		  Page<HuiyuannianxiaofeixinxiView> page =new Query<HuiyuannianxiaofeixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuiyuannianxiaofeixinxiVO> selectListVO(Wrapper<HuiyuannianxiaofeixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuiyuannianxiaofeixinxiVO selectVO(Wrapper<HuiyuannianxiaofeixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuiyuannianxiaofeixinxiView> selectListView(Wrapper<HuiyuannianxiaofeixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyuannianxiaofeixinxiView selectView(Wrapper<HuiyuannianxiaofeixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
