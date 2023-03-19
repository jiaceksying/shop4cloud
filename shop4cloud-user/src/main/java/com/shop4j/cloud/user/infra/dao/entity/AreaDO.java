package com.shop4j.cloud.user.infra.dao.entity;

import com.shop4j.cloud.common.model.BaseModel;
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
     * 主键ID
     */
    private Long areaId;

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