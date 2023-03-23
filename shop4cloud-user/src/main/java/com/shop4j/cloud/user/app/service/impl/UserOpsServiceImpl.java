package com.shop4j.cloud.user.app.service.impl;

import com.shop4j.cloud.common.database.util.PageUtils;
import com.shop4j.cloud.common.database.vo.PageVO;
import com.shop4j.cloud.common.response.ResponseEnum;
import com.shop4j.cloud.common.response.UnifiedResponse;
import com.shop4j.cloud.user.app.converter.UserOpsConverter;
import com.shop4j.cloud.user.app.service.UserOpsService;
import com.shop4j.cloud.user.client.param.UserOpsQueryParam;
import com.shop4j.cloud.user.client.vo.UserOpsVO;
import com.shop4j.cloud.user.infra.dao.entity.UserDO;
import com.shop4j.cloud.user.infra.dao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 用户后台操作service
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2023/3/21
 */
@Service
public class UserOpsServiceImpl implements UserOpsService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UnifiedResponse<UserOpsVO> findById(Long userId) {
        UserDO userDO = userMapper.selectByPrimaryKey(userId);
        if (Objects.isNull(userDO)) {
            return UnifiedResponse.fail(ResponseEnum.ERROR_PARAM);
        }

        return UnifiedResponse.success(UserOpsConverter.toVO(userDO));
    }

    @Override
    public PageVO<UserOpsVO> findByPage(UserOpsQueryParam param) {
        List<UserDO> list = userMapper.selectByParam(param);
        Long count = userMapper.countByParam(param);

        List<UserOpsVO> voList = list.stream()
                .map(UserOpsConverter::toVO).collect(Collectors.toList());

        return PageUtils.doPage(param.getPageSize(), voList, count);
    }
}
