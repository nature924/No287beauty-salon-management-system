package com.entity.view;

import com.entity.MeirongbuweiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 美容部位
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-26 10:06:05
 */
@TableName("meirongbuwei")
public class MeirongbuweiView  extends MeirongbuweiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MeirongbuweiView(){
	}
 
 	public MeirongbuweiView(MeirongbuweiEntity meirongbuweiEntity){
 	try {
			BeanUtils.copyProperties(this, meirongbuweiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
