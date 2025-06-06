package com.entity.view;

import com.entity.ShuiguoEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 水果
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shuiguo")
public class ShuiguoView extends ShuiguoEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 水果类型的值
		*/
		private String shuiguoValue;
		/**
		* 是否上架的值
		*/
		private String shangxiaValue;



	public ShuiguoView() {

	}

	public ShuiguoView(ShuiguoEntity shuiguoEntity) {
		try {
			BeanUtils.copyProperties(this, shuiguoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 水果类型的值
			*/
			public String getShuiguoValue() {
				return shuiguoValue;
			}
			/**
			* 设置： 水果类型的值
			*/
			public void setShuiguoValue(String shuiguoValue) {
				this.shuiguoValue = shuiguoValue;
			}
			/**
			* 获取： 是否上架的值
			*/
			public String getShangxiaValue() {
				return shangxiaValue;
			}
			/**
			* 设置： 是否上架的值
			*/
			public void setShangxiaValue(String shangxiaValue) {
				this.shangxiaValue = shangxiaValue;
			}












}
