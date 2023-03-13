package com.shop4j.cloud.user.entity;

import com.shop4j.cloud.common.model.BaseModel;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * 省市区地区信息
 *
 * @author amos.wang
 * @date 2023-03-13 23:51
 */
@Getter
@Setter
public class AreaDO extends BaseModel {
    /**
     * 
     */
    private Long areaId;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 地址
     */
    private String areaName;

    /**
     * 上级地址
     */
    private Long parentId;

    /**
     * 等级（从1开始）
     */
    private Integer level;
}