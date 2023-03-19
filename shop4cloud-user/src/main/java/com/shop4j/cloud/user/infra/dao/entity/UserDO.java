package com.shop4j.cloud.user.infra.dao.entity;

import com.shop4j.cloud.common.model.BaseModel;
import lombok.Getter;
import lombok.Setter;

/**
 * 用户表
 *
 * @author amos.wang
 * @date 2023-03-13 23:51
 */
@Getter
@Setter
public class UserDO extends BaseModel {
    /**
     * 主键ID
     */
    private Long userId;

    /**
     * 用户昵称
     */
    private String nickName;

    /**
     * 头像图片路径
     */
    private String pic;

    /**
     * 状态 1 正常 0 无效
     */
    private Integer status;
}