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
 * 销量信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-26 10:06:05
 */
@TableName("xiaoliangxinxi")
public class XiaoliangxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XiaoliangxinxiEntity() {
		
	}
	
	public XiaoliangxinxiEntity(T t) {
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
