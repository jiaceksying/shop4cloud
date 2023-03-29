package com.shop4j.cloud.rbac.infrastructure.entity;

import com.shop4j.cloud.common.model.BaseModel;
import lombok.Getter;
import lombok.Setter;

/**
 * @author ksying
 * @date 2023/3/20 19:33
 */
@Setter
@Getter
public class RoleMenu extends BaseModel {

    /**
     * 关联id
     */
    private Long id;

    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 菜单ID
     */
    private Long menuId;

    /**
     * 菜单资源用户id
     */
    private Long menuPermissionId;

    @Override
    public String toString() {
        return "RoleMenu{" +
                "id=" + id +
                ", roleId=" + roleId +
                ", menuId=" + menuId +
                ", menuPermissionId=" + menuPermissionId +
                "} " + super.toString();
    }
}
