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
 * 前台月业绩统计
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-26 10:06:06
 */
@TableName("qiantaiyueyejitongji")
public class QiantaiyueyejitongjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QiantaiyueyejitongjiEntity() {
		
	}
	
	public QiantaiyueyejitongjiEntity(T t) {
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
	 * 前台账号
	 */
					
	private String qiantaizhanghao;
	
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
	 * 月业绩额
	 */
					
	private Integer yueyejie;
	
	
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
	 * 设置：前台账号
	 */
	public void setQiantaizhanghao(String qiantaizhanghao) {
		this.qiantaizhanghao = qiantaizhanghao;
	}
	/**
	 * 获取：前台账号
	 */
	public String getQiantaizhanghao() {
		return qiantaizhanghao;
	}
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
