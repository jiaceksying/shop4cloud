package com.shop4j.cloud.rbac.infrastructure.entity;

import com.shop4j.cloud.common.model.BaseModel;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author ksying
 * @date 2023/3/20 19:32
 */
@Setter
@Getter
public class MenuPermission extends BaseModel implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 菜单资源用户id
     */
    private Long menuPermissionId;

    /**
     * 资源关联菜单
     */
    private Long menuId;

    /**
     * 业务类型 0平台菜单 1 店铺菜单
     */
    private Integer bizType;

    /**
     * 权限对应的编码
     */
    private String permission;

    /**
     * 资源名称
     */
    private String name;

    /**
     * 资源对应服务器路径
     */
    private String uri;

    /**
     * 请求方法 1.GET 2.POST 3.PUT 4.DELETE
     */
    private Integer method;

    @Override
    public String toString() {
        return "MenuPermissionVO{" +
                "menuPermissionId=" + menuPermissionId +
                ",createTime=" + createTime +
                ",updateTime=" + updateTime +
                ",menuId=" + menuId +
                ",bizType=" + bizType +
                ",permission=" + permission +
                ",name=" + name +
                ",uri=" + uri +
                ",method=" + method +
                '}';
    }
}
