package com.entity.vo;

import com.entity.QiantainianyejitongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 前台年业绩统计
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-26 10:06:06
 */
public class QiantainianyejitongjiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 前台姓名
	 */
	
	private String qiantaixingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 拉拢客户人数
	 */
	
	private Integer lalongkehurenshu;
		
	/**
	 * 年业绩额
	 */
	
	private Integer nianyejie;
				
	
	/**
	 * 设置：前台姓名
	 */
	 
	public void setQiantaixingming(String qiantaixingming) {
		this.qiantaixingming = qiantaixingming;
	}
	
	/**
	 * 获取：前台姓名
	 */
	public String getQiantaixingming() {
		return qiantaixingming;
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
	 * 设置：拉拢客户人数
	 */
	 
	public void setLalongkehurenshu(Integer lalongkehurenshu) {
		this.lalongkehurenshu = lalongkehurenshu;
	}
	
	/**
	 * 获取：拉拢客户人数
	 */
	public Integer getLalongkehurenshu() {
		return lalongkehurenshu;
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
