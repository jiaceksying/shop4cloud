package com.shop4j.cloud.user.service.ops;

import com.shop4j.cloud.api.leaf.dubbo.SegmentDubboService;
import com.shop4j.cloud.common.database.vo.PageVO;
import com.shop4j.cloud.common.response.UnifiedResponse;
import com.shop4j.cloud.user.app.service.UserOpsService;
import com.shop4j.cloud.user.app.service.UserService;
import com.shop4j.cloud.user.client.dto.UserRegisterDTO;
import com.shop4j.cloud.user.client.param.UserOpsQueryParam;
import com.shop4j.cloud.user.client.vo.UserOpsVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 用户后台操作
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2023/3/22
 */
@Slf4j
@SpringBootTest
public class UserOpsServiceTests {

    @Autowired
    private UserOpsService userOpsService;

    @Autowired
    private UserService userService;
    @DubboReference
    private SegmentDubboService segmentDubboService;


    @Test
    void register() {
        for (int i = 0; i < 88; i++) {
            UnifiedResponse<Long> response = segmentDubboService.getSegmentId("shop4cloud-user");

            UserRegisterDTO userRegisterDTO = new UserRegisterDTO();
            userRegisterDTO.setUserId(response.getData());
            userRegisterDTO.setNickName("AmosWang" + String.format("%04d", i));
            userRegisterDTO.setPassword("123456");
            userRegisterDTO.setImg(null);
            userRegisterDTO.setTempUid(null);

            UnifiedResponse<Long> register = userService.register(userRegisterDTO);
            log.info("user register! result: {}", register);
        }
    }

    @Test
    public void findById() {
        UnifiedResponse<UserOpsVO> response = userOpsService.findById(1000L);
        log.info("user findById! result: {}", response);
    }

    @Test
    public void findByPage() {
        UserOpsQueryParam queryParam = new UserOpsQueryParam();
        queryParam.setPageNum(1);
        queryParam.setPageSize(10);
        queryParam.setStatus(2);
        PageVO<UserOpsVO> response = userOpsService.findByPage(queryParam);
        log.info("user findByPage! result: {}", response);
    }

}
