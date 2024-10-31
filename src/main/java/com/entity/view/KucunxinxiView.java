package com.entity.view;

import com.entity.KucunxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 库存信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-26 10:06:05
 */
@TableName("kucunxinxi")
public class KucunxinxiView  extends KucunxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KucunxinxiView(){
	}
 
 	public KucunxinxiView(KucunxinxiEntity kucunxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, kucunxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
