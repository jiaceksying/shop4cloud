package com.shop4j.cloud.user.facade;

import com.shop4j.cloud.common.response.UnifiedResponseEntity;
import com.shop4j.cloud.user.api.UserApi;
import com.shop4j.cloud.user.model.UserDTO;
import org.apache.dubbo.config.annotation.DubboService;

import java.time.LocalDateTime;

/**
 * 用户服务API
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2023/3/14
 */
@DubboService(interfaceClass = UserApi.class, version = "1.0.0", group = "shop-cloud")
public class UserApiImpl implements UserApi {

    @Override
    public UnifiedResponseEntity<UserDTO> getById(Long id) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(id);
        userDTO.setNickName("default");
        userDTO.setPic("https://vue-color-avatar.vercel.app/");
        userDTO.setStatus(1);
        userDTO.setCreateTime(LocalDateTime.now());
        userDTO.setUpdateTime(LocalDateTime.now());

        return UnifiedResponseEntity.success(userDTO);
    }
}
