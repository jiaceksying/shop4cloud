package com.shop4j.cloud.common.database.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.List;

/**
 * @author ksying
 * @date 2023/3/12 15:20
 */
@Getter
@Setter
public class PageVO<T> {

	@ApiModelProperty("总页数")
	private Integer pages;

	@ApiModelProperty("总条目数")
	private Long total;

	@ApiModelProperty("结果集")
	private List<T> list;

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

}
