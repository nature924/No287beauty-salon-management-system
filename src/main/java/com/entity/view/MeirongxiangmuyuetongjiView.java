package com.entity.view;

import com.entity.MeirongxiangmuyuetongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 美容项目月统计
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-26 10:06:05
 */
@TableName("meirongxiangmuyuetongji")
public class MeirongxiangmuyuetongjiView  extends MeirongxiangmuyuetongjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MeirongxiangmuyuetongjiView(){
	}
 
 	public MeirongxiangmuyuetongjiView(MeirongxiangmuyuetongjiEntity meirongxiangmuyuetongjiEntity){
 	try {
			BeanUtils.copyProperties(this, meirongxiangmuyuetongjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
