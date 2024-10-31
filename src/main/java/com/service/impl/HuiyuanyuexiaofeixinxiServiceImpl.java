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


import com.dao.HuiyuanyuexiaofeixinxiDao;
import com.entity.HuiyuanyuexiaofeixinxiEntity;
import com.service.HuiyuanyuexiaofeixinxiService;
import com.entity.vo.HuiyuanyuexiaofeixinxiVO;
import com.entity.view.HuiyuanyuexiaofeixinxiView;

@Service("huiyuanyuexiaofeixinxiService")
public class HuiyuanyuexiaofeixinxiServiceImpl extends ServiceImpl<HuiyuanyuexiaofeixinxiDao, HuiyuanyuexiaofeixinxiEntity> implements HuiyuanyuexiaofeixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyuanyuexiaofeixinxiEntity> page = this.selectPage(
                new Query<HuiyuanyuexiaofeixinxiEntity>(params).getPage(),
                new EntityWrapper<HuiyuanyuexiaofeixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyuanyuexiaofeixinxiEntity> wrapper) {
		  Page<HuiyuanyuexiaofeixinxiView> page =new Query<HuiyuanyuexiaofeixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuiyuanyuexiaofeixinxiVO> selectListVO(Wrapper<HuiyuanyuexiaofeixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuiyuanyuexiaofeixinxiVO selectVO(Wrapper<HuiyuanyuexiaofeixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuiyuanyuexiaofeixinxiView> selectListView(Wrapper<HuiyuanyuexiaofeixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyuanyuexiaofeixinxiView selectView(Wrapper<HuiyuanyuexiaofeixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
