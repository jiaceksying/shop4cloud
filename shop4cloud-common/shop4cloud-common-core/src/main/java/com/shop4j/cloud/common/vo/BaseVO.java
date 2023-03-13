package com.shop4j.cloud.common.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author ksying
 * @date 2023/3/12 14:47
 */
@Getter
@Setter
public class BaseVO {

	/**
	 * 创建时间
	 */
	@ApiModelProperty("创建时间")
	protected Date createTime;

	/**
	 * 更新时间
	 */
	@ApiModelProperty("更新时间")
	protected Date updateTime;

	@Override
	public String toString() {
		return "BaseDTO{" + "createTime=" + createTime + ", updateTime=" + updateTime + '}';
	}

}
