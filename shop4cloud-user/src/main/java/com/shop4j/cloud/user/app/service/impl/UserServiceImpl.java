package com.shop4j.cloud.user.app.service.impl;

import com.shop4j.cloud.common.response.UnifiedResponse;
import com.shop4j.cloud.user.app.command.UserRegisterCmdExe;
import com.shop4j.cloud.user.app.service.UserService;
import com.shop4j.cloud.user.client.dto.UserRegisterDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户Service
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2023/3/14
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRegisterCmdExe userRegisterCmdExe;

    @Override
    public UnifiedResponse<Long> register(UserRegisterDTO param) {
        return userRegisterCmdExe.register(param);
    }
}
