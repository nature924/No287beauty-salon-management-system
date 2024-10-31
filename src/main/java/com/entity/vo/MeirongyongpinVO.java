package com.entity.vo;

import com.entity.MeirongyongpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 美容用品
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-26 10:06:05
 */
public class MeirongyongpinVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 类型
	 */
	
	private String leixing;
		
	/**
	 * 库存
	 */
	
	private Integer kucun;
		
	/**
	 * 使用方法
	 */
	
	private String shiyongfangfa;
		
	/**
	 * 适用年龄
	 */
	
	private String shiyongnianling;
		
	/**
	 * 美容部位
	 */
	
	private String meirongbuwei;
		
	/**
	 * 美容功效
	 */
	
	private String meironggongxiao;
		
	/**
	 * 积分
	 */
	
	private Integer jifen;
		
	/**
	 * 价格
	 */
	
	private Float price;
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
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
	 * 设置：库存
	 */
	 
	public void setKucun(Integer kucun) {
		this.kucun = kucun;
	}
	
	/**
	 * 获取：库存
	 */
	public Integer getKucun() {
		return kucun;
	}
				
	
	/**
	 * 设置：使用方法
	 */
	 
	public void setShiyongfangfa(String shiyongfangfa) {
		this.shiyongfangfa = shiyongfangfa;
	}
	
	/**
	 * 获取：使用方法
	 */
	public String getShiyongfangfa() {
		return shiyongfangfa;
	}
				
	
	/**
	 * 设置：适用年龄
	 */
	 
	public void setShiyongnianling(String shiyongnianling) {
		this.shiyongnianling = shiyongnianling;
	}
	
	/**
	 * 获取：适用年龄
	 */
	public String getShiyongnianling() {
		return shiyongnianling;
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
	 * 设置：美容功效
	 */
	 
	public void setMeironggongxiao(String meironggongxiao) {
		this.meironggongxiao = meironggongxiao;
	}
	
	/**
	 * 获取：美容功效
	 */
	public String getMeironggongxiao() {
		return meironggongxiao;
	}
				
	
	/**
	 * 设置：积分
	 */
	 
	public void setJifen(Integer jifen) {
		this.jifen = jifen;
	}
	
	/**
	 * 获取：积分
	 */
	public Integer getJifen() {
		return jifen;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setPrice(Float price) {
		this.price = price;
	}
	
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}
			
}
