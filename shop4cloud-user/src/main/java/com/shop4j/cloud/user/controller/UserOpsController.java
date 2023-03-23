package com.shop4j.cloud.user.controller;

import com.shop4j.cloud.common.database.vo.PageVO;
import com.shop4j.cloud.common.response.UnifiedResponse;
import com.shop4j.cloud.user.app.service.UserOpsService;
import com.shop4j.cloud.user.client.param.UserOpsQueryParam;
import com.shop4j.cloud.user.client.vo.UserOpsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用户后台操作
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2023/3/17
 */
@RestController
@RequestMapping("user/ops")
public class UserOpsController {

    @Autowired
    private UserOpsService userOpsService;

    @GetMapping("findById")
    public UnifiedResponse<UserOpsVO> findById(Long userId) {
        return userOpsService.findById(userId);
    }

    @PostMapping("findByPage")
    public UnifiedResponse<PageVO<UserOpsVO>> findByPage(@RequestBody UserOpsQueryParam param) {
        return UnifiedResponse.success(userOpsService.findByPage(param));
    }

}
