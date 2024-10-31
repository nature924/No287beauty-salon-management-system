package com.entity.view;

import com.entity.QiantaiyueyejitongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 前台月业绩统计
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-26 10:06:06
 */
@TableName("qiantaiyueyejitongji")
public class QiantaiyueyejitongjiView  extends QiantaiyueyejitongjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QiantaiyueyejitongjiView(){
	}
 
 	public QiantaiyueyejitongjiView(QiantaiyueyejitongjiEntity qiantaiyueyejitongjiEntity){
 	try {
			BeanUtils.copyProperties(this, qiantaiyueyejitongjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
