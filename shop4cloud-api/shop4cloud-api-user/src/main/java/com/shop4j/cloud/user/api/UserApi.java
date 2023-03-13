package com.shop4j.cloud.user.api;

import com.shop4j.cloud.common.response.UnifiedResponseEntity;
import com.shop4j.cloud.user.model.UserDTO;

/**
 * 用户服务API
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2023/3/14
 */
public interface UserApi {

    /**
     * 根据ID查询用户信息
     *
     * @param id 用户ID
     * @return 用户信息
     */
    UnifiedResponseEntity<UserDTO> getById(Long id);

}
