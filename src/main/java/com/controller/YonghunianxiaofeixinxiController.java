package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.YonghunianxiaofeixinxiEntity;
import com.entity.view.YonghunianxiaofeixinxiView;

import com.service.YonghunianxiaofeixinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 用户年消费信息
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-26 10:06:06
 */
@RestController
@RequestMapping("/yonghunianxiaofeixinxi")
public class YonghunianxiaofeixinxiController {
    @Autowired
    private YonghunianxiaofeixinxiService yonghunianxiaofeixinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YonghunianxiaofeixinxiEntity yonghunianxiaofeixinxi,
		HttpServletRequest request){
        EntityWrapper<YonghunianxiaofeixinxiEntity> ew = new EntityWrapper<YonghunianxiaofeixinxiEntity>();
		PageUtils page = yonghunianxiaofeixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yonghunianxiaofeixinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YonghunianxiaofeixinxiEntity yonghunianxiaofeixinxi, 
		HttpServletRequest request){
        EntityWrapper<YonghunianxiaofeixinxiEntity> ew = new EntityWrapper<YonghunianxiaofeixinxiEntity>();
		PageUtils page = yonghunianxiaofeixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yonghunianxiaofeixinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YonghunianxiaofeixinxiEntity yonghunianxiaofeixinxi){
       	EntityWrapper<YonghunianxiaofeixinxiEntity> ew = new EntityWrapper<YonghunianxiaofeixinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yonghunianxiaofeixinxi, "yonghunianxiaofeixinxi")); 
        return R.ok().put("data", yonghunianxiaofeixinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YonghunianxiaofeixinxiEntity yonghunianxiaofeixinxi){
        EntityWrapper< YonghunianxiaofeixinxiEntity> ew = new EntityWrapper< YonghunianxiaofeixinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yonghunianxiaofeixinxi, "yonghunianxiaofeixinxi")); 
		YonghunianxiaofeixinxiView yonghunianxiaofeixinxiView =  yonghunianxiaofeixinxiService.selectView(ew);
		return R.ok("查询用户年消费信息成功").put("data", yonghunianxiaofeixinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YonghunianxiaofeixinxiEntity yonghunianxiaofeixinxi = yonghunianxiaofeixinxiService.selectById(id);
        return R.ok().put("data", yonghunianxiaofeixinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YonghunianxiaofeixinxiEntity yonghunianxiaofeixinxi = yonghunianxiaofeixinxiService.selectById(id);
        return R.ok().put("data", yonghunianxiaofeixinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YonghunianxiaofeixinxiEntity yonghunianxiaofeixinxi, HttpServletRequest request){
    	yonghunianxiaofeixinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yonghunianxiaofeixinxi);
        yonghunianxiaofeixinxiService.insert(yonghunianxiaofeixinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
	@IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody YonghunianxiaofeixinxiEntity yonghunianxiaofeixinxi, HttpServletRequest request){
    	yonghunianxiaofeixinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yonghunianxiaofeixinxi);
        yonghunianxiaofeixinxiService.insert(yonghunianxiaofeixinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody YonghunianxiaofeixinxiEntity yonghunianxiaofeixinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yonghunianxiaofeixinxi);
        yonghunianxiaofeixinxiService.updateById(yonghunianxiaofeixinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yonghunianxiaofeixinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<YonghunianxiaofeixinxiEntity> wrapper = new EntityWrapper<YonghunianxiaofeixinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = yonghunianxiaofeixinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
