package com.shop4j.cloud.common.model;

/**
 * 常用枚举
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2023/3/18
 */
public interface BaseEnum<K, V> {

    /**
     * 获取key
     *
     * @return key
     */
    K getKey();

    /**
     * 获取value
     *
     * @return value
     */
    V getValue();

}
