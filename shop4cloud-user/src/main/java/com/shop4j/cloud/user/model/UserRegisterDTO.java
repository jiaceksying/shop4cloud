package com.shop4j.cloud.user.model;

import com.shop4j.cloud.common.dto.BaseDTO;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;

/**
 * 用户注册DTO
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2023/3/17
 */
@Getter
@Setter
public class UserRegisterDTO extends BaseDTO {

    @Serial
    private static final long serialVersionUID = 3270939343327299046L;

    private Long userId;

    @NotBlank
    private String userName;

    private String nickName;

    @NotBlank
    private String password;

    private String img;

    private String tempUid;

}
