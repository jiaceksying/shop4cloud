package com.shop4j.cloud.common.model;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author ksying
 * @date 2023/3/12 14:54
 */
@Getter
@Setter
public class BaseModel implements Serializable {

    @Serial
    private static final long serialVersionUID = -2603831045758485904L;

	/**
	 * 创建时间
	 */
	protected LocalDateTime createTime;

	/**
	 * 更新时间
	 */
	protected LocalDateTime updateTime;

	@Override
	public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

}
