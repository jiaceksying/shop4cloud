package com.shop4j.cloud.user.service;

import com.shop4j.cloud.api.leaf.dubbo.SegmentDubboService;
import com.shop4j.cloud.common.response.UnifiedResponse;
import com.shop4j.cloud.user.app.service.UserService;
import com.shop4j.cloud.user.client.dto.UserRegisterDTO;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

@Slf4j
@SpringBootTest
class UserServiceTests {

    @Autowired
    private UserService userService;
    @DubboReference
    private SegmentDubboService segmentDubboService;

    @Test
    public void generateId() {
        UnifiedResponse<Long> segmentId = segmentDubboService.getSegmentId("shop4cloud-user");
        log.info("get segment id! result: {}", segmentId);
    }

    @Test
    @Rollback
    void register() {
        UserRegisterDTO userRegisterDTO = new UserRegisterDTO();
        userRegisterDTO.setUserId(1000L);
        userRegisterDTO.setUserName("amos.wang");
        userRegisterDTO.setNickName("AmosWang");
        userRegisterDTO.setPassword("123456");
        userRegisterDTO.setImg(null);
        userRegisterDTO.setTempUid(null);

        UnifiedResponse<Long> register = userService.register(userRegisterDTO);
        log.info("user register! result: {}", register);
    }

}
