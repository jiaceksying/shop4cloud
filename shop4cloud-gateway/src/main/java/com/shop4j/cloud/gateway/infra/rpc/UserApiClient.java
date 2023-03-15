package com.shop4j.cloud.gateway.infra.rpc;

import com.shop4j.cloud.common.response.UnifiedResponseEntity;
import com.shop4j.cloud.user.model.UserDTO;

/**
 * 用户服务API
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2023/3/15
 */
public interface UserApiClient {

    UnifiedResponseEntity<UserDTO> getById(Long id);

}
