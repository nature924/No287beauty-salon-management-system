package com.entity.view;

import com.entity.QiantainianyejitongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 前台年业绩统计
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-26 10:06:06
 */
@TableName("qiantainianyejitongji")
public class QiantainianyejitongjiView  extends QiantainianyejitongjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QiantainianyejitongjiView(){
	}
 
 	public QiantainianyejitongjiView(QiantainianyejitongjiEntity qiantainianyejitongjiEntity){
 	try {
			BeanUtils.copyProperties(this, qiantainianyejitongjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
