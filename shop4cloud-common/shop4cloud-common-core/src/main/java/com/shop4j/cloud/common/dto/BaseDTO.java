package com.shop4j.cloud.common.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author ksying
 * @date 2023/3/12 14:52
 */
@Getter
@Setter
public class BaseDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 3790371363799063337L;

    /**
	 * 创建时间
	 */
	@ApiModelProperty("创建时间")
    protected LocalDateTime createTime;

	/**
	 * 更新时间
	 */
	@ApiModelProperty("更新时间")
    protected LocalDateTime updateTime;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
