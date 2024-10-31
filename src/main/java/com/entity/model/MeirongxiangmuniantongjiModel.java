package com.entity.model;

import com.entity.MeirongxiangmuniantongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 美容项目年统计
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-26 10:06:05
 */
public class MeirongxiangmuniantongjiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 项目照片
	 */
	
	private String xiangmuzhaopian;
		
	/**
	 * 美容部位
	 */
	
	private String meirongbuwei;
		
	/**
	 * 统计日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tongjiriqi;
		
	/**
	 * 项目价格
	 */
	
	private Integer xiangmujiage;
		
	/**
	 * 年销量
	 */
	
	private Integer nianxiaoliang;
		
	/**
	 * 年销售额
	 */
	
	private Integer nianxiaoshoue;
				
	
	/**
	 * 设置：项目照片
	 */
	 
	public void setXiangmuzhaopian(String xiangmuzhaopian) {
		this.xiangmuzhaopian = xiangmuzhaopian;
	}
	
	/**
	 * 获取：项目照片
	 */
	public String getXiangmuzhaopian() {
		return xiangmuzhaopian;
	}
				
	
	/**
	 * 设置：美容部位
	 */
	 
	public void setMeirongbuwei(String meirongbuwei) {
		this.meirongbuwei = meirongbuwei;
	}
	
	/**
	 * 获取：美容部位
	 */
	public String getMeirongbuwei() {
		return meirongbuwei;
	}
				
	
	/**
	 * 设置：统计日期
	 */
	 
	public void setTongjiriqi(Date tongjiriqi) {
		this.tongjiriqi = tongjiriqi;
	}
	
	/**
	 * 获取：统计日期
	 */
	public Date getTongjiriqi() {
		return tongjiriqi;
	}
				
	
	/**
	 * 设置：项目价格
	 */
	 
	public void setXiangmujiage(Integer xiangmujiage) {
		this.xiangmujiage = xiangmujiage;
	}
	
	/**
	 * 获取：项目价格
	 */
	public Integer getXiangmujiage() {
		return xiangmujiage;
	}
				
	
	/**
	 * 设置：年销量
	 */
	 
	public void setNianxiaoliang(Integer nianxiaoliang) {
		this.nianxiaoliang = nianxiaoliang;
	}
	
	/**
	 * 获取：年销量
	 */
	public Integer getNianxiaoliang() {
		return nianxiaoliang;
	}
				
	
	/**
	 * 设置：年销售额
	 */
	 
	public void setNianxiaoshoue(Integer nianxiaoshoue) {
		this.nianxiaoshoue = nianxiaoshoue;
	}
	
	/**
	 * 获取：年销售额
	 */
	public Integer getNianxiaoshoue() {
		return nianxiaoshoue;
	}
			
}
