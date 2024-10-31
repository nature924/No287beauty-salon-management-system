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


import com.dao.HuiyuanyuyuexinxiDao;
import com.entity.HuiyuanyuyuexinxiEntity;
import com.service.HuiyuanyuyuexinxiService;
import com.entity.vo.HuiyuanyuyuexinxiVO;
import com.entity.view.HuiyuanyuyuexinxiView;

@Service("huiyuanyuyuexinxiService")
public class HuiyuanyuyuexinxiServiceImpl extends ServiceImpl<HuiyuanyuyuexinxiDao, HuiyuanyuyuexinxiEntity> implements HuiyuanyuyuexinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyuanyuyuexinxiEntity> page = this.selectPage(
                new Query<HuiyuanyuyuexinxiEntity>(params).getPage(),
                new EntityWrapper<HuiyuanyuyuexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyuanyuyuexinxiEntity> wrapper) {
		  Page<HuiyuanyuyuexinxiView> page =new Query<HuiyuanyuyuexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuiyuanyuyuexinxiVO> selectListVO(Wrapper<HuiyuanyuyuexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuiyuanyuyuexinxiVO selectVO(Wrapper<HuiyuanyuyuexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuiyuanyuyuexinxiView> selectListView(Wrapper<HuiyuanyuyuexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyuanyuyuexinxiView selectView(Wrapper<HuiyuanyuyuexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
