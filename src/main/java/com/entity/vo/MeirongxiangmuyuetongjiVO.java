package com.entity.vo;

import com.entity.MeirongxiangmuyuetongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 美容项目月统计
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-26 10:06:05
 */
public class MeirongxiangmuyuetongjiVO  implements Serializable {
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
	 * 月销量
	 */
	
	private Integer yuexiaoliang;
		
	/**
	 * 月销售额
	 */
	
	private Integer yuexiaoshoue;
				
	
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
	 * 设置：月销量
	 */
	 
	public void setYuexiaoliang(Integer yuexiaoliang) {
		this.yuexiaoliang = yuexiaoliang;
	}
	
	/**
	 * 获取：月销量
	 */
	public Integer getYuexiaoliang() {
		return yuexiaoliang;
	}
				
	
	/**
	 * 设置：月销售额
	 */
	 
	public void setYuexiaoshoue(Integer yuexiaoshoue) {
		this.yuexiaoshoue = yuexiaoshoue;
	}
	
	/**
	 * 获取：月销售额
	 */
	public Integer getYuexiaoshoue() {
		return yuexiaoshoue;
	}
			
}
