package com.shop4j.cloud.gateway.infra.rpc;

import com.shop4j.cloud.common.response.UnifiedResponse;
import com.shop4j.cloud.user.model.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 用户服务API Tests
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2023/3/15
 */
@Slf4j
@SpringBootTest
public class UserApiClientTests {

    @Autowired
    private UserApiClient userApiClient;

    @Test
    public void getUserById() {
        Long userId = 100L;
        UnifiedResponse<UserDTO> response = userApiClient.getById(userId);
        log.info("getUserById id: [{}], result: [{}]", userId, response);

        log.info("user info! [{}]", response.getData());
    }

}
