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
 * 技师年业绩统计
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-26 10:06:06
 */
@TableName("jishinianyejitongji")
public class JishinianyejitongjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JishinianyejitongjiEntity() {
		
	}
	
	public JishinianyejitongjiEntity(T t) {
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
	 * 技师工号
	 */
					
	private String jishigonghao;
	
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
