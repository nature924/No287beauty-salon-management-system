package com.entity.model;

import com.entity.MeirongxiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 美容项目
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-26 10:06:05
 */
public class MeirongxiangmuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 项目图片
	 */
	
	private String xiangmutupian;
		
	/**
	 * 美容部位
	 */
	
	private String meirongbuwei;
		
	/**
	 * 适用年龄
	 */
	
	private String shiyongnianling;
		
	/**
	 * 项目价格
	 */
	
	private Integer xiangmujiage;
		
	/**
	 * 详情
	 */
	
	private String xiangqing;
		
	/**
	 * 开始时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaishishijian;
		
	/**
	 * 技师工号
	 */
	
	private String jishigonghao;
		
	/**
	 * 技师姓名
	 */
	
	private String jishixingming;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
				
	
	/**
	 * 设置：项目图片
	 */
	 
	public void setXiangmutupian(String xiangmutupian) {
		this.xiangmutupian = xiangmutupian;
	}
	
	/**
	 * 获取：项目图片
	 */
	public String getXiangmutupian() {
		return xiangmutupian;
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
	 * 设置：详情
	 */
	 
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
	}
				
	
	/**
	 * 设置：开始时间
	 */
	 
	public void setKaishishijian(Date kaishishijian) {
		this.kaishishijian = kaishishijian;
	}
	
	/**
	 * 获取：开始时间
	 */
	public Date getKaishishijian() {
		return kaishishijian;
	}
				
	
	/**
	 * 设置：技师工号
	 */
	 
	public void setJishigonghao(String jishigonghao) {
		this.jishigonghao = jishigonghao;
	}
	
	/**
	 * 获取：技师工号
	 */
	public String getJishigonghao() {
		return jishigonghao;
	}
				
	
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
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
			
}
