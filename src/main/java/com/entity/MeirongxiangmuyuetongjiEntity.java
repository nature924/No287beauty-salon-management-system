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
 * 美容项目月统计
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-26 10:06:05
 */
@TableName("meirongxiangmuyuetongji")
public class MeirongxiangmuyuetongjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public MeirongxiangmuyuetongjiEntity() {
		
	}
	
	public MeirongxiangmuyuetongjiEntity(T t) {
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
	 * 项目名称
	 */
					
	private String xiangmumingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	 * 设置：项目名称
	 */
	public void setXiangmumingcheng(String xiangmumingcheng) {
		this.xiangmumingcheng = xiangmumingcheng;
	}
	/**
	 * 获取：项目名称
	 */
	public String getXiangmumingcheng() {
		return xiangmumingcheng;
	}
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
