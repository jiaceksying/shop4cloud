package com.shop4j.cloud.user.app.service.impl;

import com.shop4j.cloud.common.response.ResponseEnum;
import com.shop4j.cloud.common.response.UnifiedResponse;
import com.shop4j.cloud.user.app.converter.UserOpsConverter;
import com.shop4j.cloud.user.app.service.UserOpsService;
import com.shop4j.cloud.user.client.vo.UserOpsVO;
import com.shop4j.cloud.user.infra.dao.entity.UserDO;
import com.shop4j.cloud.user.infra.dao.mapper.UserMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * 用户后台操作service
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2023/3/21
 */
@Service
public class UserOpsServiceImpl implements UserOpsService {

    @Resource
    private UserMapper userMapper;

    @Override
    public UnifiedResponse<UserOpsVO> queryById(Long userId) {
        UserDO userDO = userMapper.selectByPrimaryKey(userId);
        if (Objects.isNull(userDO)) {
            return UnifiedResponse.fail(ResponseEnum.ERROR_PARAM);
        }

        return UnifiedResponse.success(UserOpsConverter.toVO(userDO));
    }
}
