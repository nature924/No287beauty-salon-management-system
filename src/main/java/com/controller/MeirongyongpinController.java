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

import com.entity.MeirongyongpinEntity;
import com.entity.view.MeirongyongpinView;

import com.service.MeirongyongpinService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 美容用品
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-26 10:06:05
 */
@RestController
@RequestMapping("/meirongyongpin")
public class MeirongyongpinController {
    @Autowired
    private MeirongyongpinService meirongyongpinService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,MeirongyongpinEntity meirongyongpin,
		HttpServletRequest request){
        EntityWrapper<MeirongyongpinEntity> ew = new EntityWrapper<MeirongyongpinEntity>();
		PageUtils page = meirongyongpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, meirongyongpin), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,MeirongyongpinEntity meirongyongpin, 
		HttpServletRequest request){
        EntityWrapper<MeirongyongpinEntity> ew = new EntityWrapper<MeirongyongpinEntity>();
		PageUtils page = meirongyongpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, meirongyongpin), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( MeirongyongpinEntity meirongyongpin){
       	EntityWrapper<MeirongyongpinEntity> ew = new EntityWrapper<MeirongyongpinEntity>();
      	ew.allEq(MPUtil.allEQMapPre( meirongyongpin, "meirongyongpin")); 
        return R.ok().put("data", meirongyongpinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(MeirongyongpinEntity meirongyongpin){
        EntityWrapper< MeirongyongpinEntity> ew = new EntityWrapper< MeirongyongpinEntity>();
 		ew.allEq(MPUtil.allEQMapPre( meirongyongpin, "meirongyongpin")); 
		MeirongyongpinView meirongyongpinView =  meirongyongpinService.selectView(ew);
		return R.ok("查询美容用品成功").put("data", meirongyongpinView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        MeirongyongpinEntity meirongyongpin = meirongyongpinService.selectById(id);
        return R.ok().put("data", meirongyongpin);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        MeirongyongpinEntity meirongyongpin = meirongyongpinService.selectById(id);
        return R.ok().put("data", meirongyongpin);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MeirongyongpinEntity meirongyongpin, HttpServletRequest request){
    	meirongyongpin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(meirongyongpin);
        meirongyongpinService.insert(meirongyongpin);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
	@IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody MeirongyongpinEntity meirongyongpin, HttpServletRequest request){
    	meirongyongpin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(meirongyongpin);
        meirongyongpinService.insert(meirongyongpin);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MeirongyongpinEntity meirongyongpin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(meirongyongpin);
        meirongyongpinService.updateById(meirongyongpin);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        meirongyongpinService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<MeirongyongpinEntity> wrapper = new EntityWrapper<MeirongyongpinEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = meirongyongpinService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
