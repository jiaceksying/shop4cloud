package com.shop4j.cloud.rbac.infrastructure.entity;

import com.shop4j.cloud.common.model.BaseModel;
import lombok.Getter;
import lombok.Setter;

/**
 * @author ksying
 * @date 2023/3/20 19:34
 */
@Setter
@Getter
public class UserRole extends BaseModel {

    /**
     * 关联id
     */
    private Long id;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 角色ID
     */
    private Long roleId;

    @Override
    public String toString() {
        return "UserRole{" + "id=" + id + ", userId=" + userId + ", roleId=" + roleId + "} " + super.toString();
    }

}
