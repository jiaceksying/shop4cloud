package com.shop4j.cloud.common.database.dto;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serial;
import java.io.Serializable;

/**
 * 分页参数（不依赖 PageHelper）
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2023/3/23
 */
@Getter
@Setter
public class BasePageDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = -3954726012238490778L;

    /**
     * 页码
     */
    private Integer pageNum;

    /**
     * 每页数据条数
     */
    private Integer pageSize;

    /**
     * limit start index
     *
     * @return index
     */
    public Integer getStart() {
        if (pageNum == null || pageSize == null) {
            return null;
        }
        int pageNo = pageNum - 1;
        if (pageNo < 0) {
            pageNo = 0;
        }

        if (pageSize < 1) {
            pageSize = 0;
        }

        return pageNo * pageSize;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
