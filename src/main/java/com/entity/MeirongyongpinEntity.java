package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 美容用品
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-26 10:06:05
 */
@TableName("meirongyongpin")
public class MeirongyongpinEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public MeirongyongpinEntity() {
		
	}
	
	public MeirongyongpinEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 美容品名
	 */
					
	private String meirongpinming;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：美容品名
	 */
	public void setMeirongpinming(String meirongpinming) {
		this.meirongpinming = meirongpinming;
	}
	/**
	 * 获取：美容品名
	 */
	public String getMeirongpinming() {
		return meirongpinming;
	}
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
