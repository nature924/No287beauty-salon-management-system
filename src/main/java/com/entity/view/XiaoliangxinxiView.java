package com.entity.view;

import com.entity.XiaoliangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 销量信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-26 10:06:05
 */
@TableName("xiaoliangxinxi")
public class XiaoliangxinxiView  extends XiaoliangxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaoliangxinxiView(){
	}
 
 	public XiaoliangxinxiView(XiaoliangxinxiEntity xiaoliangxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, xiaoliangxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
