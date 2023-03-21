package com.shop4j.cloud.user.app.converter;

import com.shop4j.cloud.user.client.vo.UserOpsVO;
import com.shop4j.cloud.user.infra.dao.entity.UserDO;

/**
 * 用户后台操作Converter
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2023/3/21
 */
public class UserOpsConverter {

    public static UserOpsVO toVO(UserDO userDO) {
        UserOpsVO userOpsVO = new UserOpsVO();
        userOpsVO.setUserId(userDO.getUserId());
        userOpsVO.setNickName(userDO.getNickName());
        userOpsVO.setPic(userDO.getPic());
        userOpsVO.setStatus(userDO.getStatus());
        userOpsVO.setCreateTime(userDO.getCreateTime());
        userOpsVO.setUpdateTime(userDO.getUpdateTime());
        userOpsVO.setCreateTime(userDO.getCreateTime());
        userOpsVO.setUpdateTime(userDO.getUpdateTime());
        return userOpsVO;
    }

}
