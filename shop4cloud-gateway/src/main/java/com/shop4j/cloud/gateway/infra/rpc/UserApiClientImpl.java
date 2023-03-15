package com.shop4j.cloud.gateway.infra.rpc;

import com.shop4j.cloud.common.response.UnifiedResponseEntity;
import com.shop4j.cloud.user.api.UserApi;
import com.shop4j.cloud.user.model.UserDTO;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * 用户服务API
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2023/3/15
 */
@Service
public class UserApiClientImpl implements UserApiClient {

    @DubboReference(interfaceClass = UserApi.class, version = "1.0.0", group = "shop-cloud")
    private UserApi userApi;

    @Override
    public UnifiedResponseEntity<UserDTO> getById(Long id) {
        return userApi.getById(id);
    }
}
