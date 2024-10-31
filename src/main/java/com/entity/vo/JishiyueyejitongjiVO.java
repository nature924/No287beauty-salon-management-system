package com.entity.vo;

import com.entity.JishiyueyejitongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 技师月业绩统计
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-26 10:06:06
 */
public class JishiyueyejitongjiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 技师姓名
	 */
	
	private String jishixingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 服务次数
	 */
	
	private Integer fuwucishu;
		
	/**
	 * 月业绩额
	 */
	
	private Integer yueyejie;
				
	
	/**
	 * 设置：技师姓名
	 */
	 
	public void setJishixingming(String jishixingming) {
		this.jishixingming = jishixingming;
	}
	
	/**
	 * 获取：技师姓名
	 */
	public String getJishixingming() {
		return jishixingming;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：服务次数
	 */
	 
	public void setFuwucishu(Integer fuwucishu) {
		this.fuwucishu = fuwucishu;
	}
	
	/**
	 * 获取：服务次数
	 */
	public Integer getFuwucishu() {
		return fuwucishu;
	}
				
	
	/**
	 * 设置：月业绩额
	 */
	 
	public void setYueyejie(Integer yueyejie) {
		this.yueyejie = yueyejie;
	}
	
	/**
	 * 获取：月业绩额
	 */
	public Integer getYueyejie() {
		return yueyejie;
	}
			
}
