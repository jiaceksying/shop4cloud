package com.shop4j.cloud.user.app.service;

import com.shop4j.cloud.common.database.vo.PageVO;
import com.shop4j.cloud.common.response.UnifiedResponse;
import com.shop4j.cloud.user.client.param.UserOpsQueryParam;
import com.shop4j.cloud.user.client.vo.UserOpsVO;

/**
 * 用户服务后台操作
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2023/3/21
 */
public interface UserOpsService {

    /**
     * 根据用户ID查询用户信息
     *
     * @param userId 用户ID
     * @return 用户信息
     */
    UnifiedResponse<UserOpsVO> findById(Long userId);

    /**
     * 分页查询操作
     *
     * @param param 入参
     * @return 结果
     */
    PageVO<UserOpsVO> findByPage(UserOpsQueryParam param);
}
