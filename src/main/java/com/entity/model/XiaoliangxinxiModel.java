package com.entity.model;

import com.entity.XiaoliangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 销量信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-26 10:06:05
 */
public class XiaoliangxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 销售时长
	 */
	
	private String xiaoshoushizhang;
		
	/**
	 * 销售量
	 */
	
	private Integer xiaoshouliang;
		
	/**
	 * 类型
	 */
	
	private String leixing;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
				
	
	/**
	 * 设置：销售时长
	 */
	 
	public void setXiaoshoushizhang(String xiaoshoushizhang) {
		this.xiaoshoushizhang = xiaoshoushizhang;
	}
	
	/**
	 * 获取：销售时长
	 */
	public String getXiaoshoushizhang() {
		return xiaoshoushizhang;
	}
				
	
	/**
	 * 设置：销售量
	 */
	 
	public void setXiaoshouliang(Integer xiaoshouliang) {
		this.xiaoshouliang = xiaoshouliang;
	}
	
	/**
	 * 获取：销售量
	 */
	public Integer getXiaoshouliang() {
		return xiaoshouliang;
	}
				
	
	/**
	 * 设置：类型
	 */
	 
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	
	/**
	 * 获取：类型
	 */
	public String getLeixing() {
		return leixing;
	}
				
	
	/**
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
			
}
