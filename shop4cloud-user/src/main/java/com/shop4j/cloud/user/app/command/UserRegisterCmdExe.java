package com.shop4j.cloud.user.app.command;

import com.shop4j.cloud.common.exception.Shop4CloudException;
import com.shop4j.cloud.common.response.ResponseEnum;
import com.shop4j.cloud.common.response.UnifiedResponse;
import com.shop4j.cloud.user.infra.dao.entity.UserDO;
import com.shop4j.cloud.user.infra.dao.mapper.UserMapper;
import com.shop4j.cloud.user.client.dto.UserRegisterDTO;
import com.shop4j.cloud.user.client.enums.UserStatusEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * 用户注册执行器
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2023/3/18
 */
@Component
public class UserRegisterCmdExe {

    @Autowired
    private UserMapper userMapper;

    public UnifiedResponse<Long> register(UserRegisterDTO param) {
        UserDO userDO = new UserDO();
        userDO.setUserId(param.getUserId());
        userDO.setNickName(param.getNickName());
        userDO.setPic(param.getImg());
        userDO.setStatus(UserStatusEnum.NORMAL.getKey());
        userDO.setCreateTime(LocalDateTime.now());
        userDO.setUpdateTime(LocalDateTime.now());

        int insertResult = userMapper.insert(userDO);
        if (insertResult < 1) {
            throw new Shop4CloudException(ResponseEnum.EXCEPTION);
        }

        return UnifiedResponse.success(userDO.getUserId());
    }

}
