package com.shop4j.cloud.user.model;

import com.shop4j.cloud.common.model.BaseEnum;

/**
 * 用户状态
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2023/3/18
 */
public enum UserStatusEnum implements BaseEnum<Integer, String> {

    /**
     * 1:启用 0:禁用 -1:删除
     */
    NORMAL(1, "启用"),
    FORBIDDEN(0, "禁用"),
    DELETE(-1, "删除");

    private final Integer key;

    private final String value;

    UserStatusEnum(Integer key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public Integer getKey() {
        return key;
    }

    @Override
    public String getValue() {
        return value;
    }
}
