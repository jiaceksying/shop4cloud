package com.shop4j.cloud.user.app.service;

import com.shop4j.cloud.common.response.UnifiedResponse;
import com.shop4j.cloud.user.client.dto.UserRegisterDTO;

/**
 * 用户Service
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2023/3/14
 */
public interface UserService {

    /**
     * 用户注册
     *
     * @param param 入参
     * @return 结果
     */
    UnifiedResponse<Long> register(UserRegisterDTO param);

}
