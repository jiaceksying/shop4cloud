package com.shop4j.cloud.user.controller;

import com.shop4j.cloud.common.response.UnifiedResponse;
import com.shop4j.cloud.user.app.service.UserService;
import com.shop4j.cloud.user.client.dto.UserRegisterDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户注册
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2023/3/17
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("register")
    public UnifiedResponse<Long> register(@RequestBody UserRegisterDTO param) {

        return userService.register(param);
    }

}

