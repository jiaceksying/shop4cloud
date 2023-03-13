package com.shop4j.cloud.user.entity;

import com.shop4j.cloud.common.model.BaseModel;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * 用户地址
 *
 * @author amos.wang
 * @date 2023-03-13 23:51
 */
@Getter
@Setter
public class UserAddrDO extends BaseModel {
    /**
     * ID
     */
    private Long addrId;

    /**
     * 建立时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 手机
     */
    private String mobile;

    /**
     * 是否默认地址 1是
     */
    private Byte isDefault;

    /**
     * 收货人
     */
    private String consignee;

    /**
     * 省ID
     */
    private Long provinceId;

    /**
     * 省
     */
    private String province;

    /**
     * 城市ID
     */
    private Long cityId;

    /**
     * 城市
     */
    private String city;

    /**
     * 区ID
     */
    private Long areaId;

    /**
     * 区
     */
    private String area;

    /**
     * 邮编
     */
    private String postCode;

    /**
     * 地址
     */
    private String addr;

    /**
     * 经度
     */
    private BigDecimal lng;

    /**
     * 纬度
     */
    private BigDecimal lat;
}