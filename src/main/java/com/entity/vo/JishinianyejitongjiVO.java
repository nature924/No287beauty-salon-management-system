package com.entity.vo;

import com.entity.JishinianyejitongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 技师年业绩统计
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-26 10:06:06
 */
public class JishinianyejitongjiVO  implements Serializable {
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
	 * 年业绩额
	 */
	
	private Integer nianyejie;
				
	
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
	 * 设置：年业绩额
	 */
	 
	public void setNianyejie(Integer nianyejie) {
		this.nianyejie = nianyejie;
	}
	
	/**
	 * 获取：年业绩额
	 */
	public Integer getNianyejie() {
		return nianyejie;
	}
			
}
