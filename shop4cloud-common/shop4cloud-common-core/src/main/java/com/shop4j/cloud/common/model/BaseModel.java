package com.shop4j.cloud.common.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ksying
 * @date 2023/3/12 14:54
 */
@Getter
@Setter
public class BaseModel implements Serializable {

    /**
     * 创建时间
     */
    protected Date createTime;

    /**
     * 更新时间
     */
    protected Date updateTime;

    @Override
    public String toString() {
        return "BaseModel{" + "createTime=" + createTime + ", updateTime=" + updateTime + '}';
    }

}
