package com.shop4j.cloud.user.model;

import com.shop4j.cloud.common.dto.BaseDTO;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;

/**
 * 用户DTO
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2023/3/14
 */
@Getter
@Setter
public class UserDTO extends BaseDTO {

    @Serial
    private static final long serialVersionUID = -2419407737163469412L;

    /**
     * ID
     */
    private Long userId;

    /**
     * 用户昵称
     */
    private String nickName;

    /**
     * 头像图片路径
     */
    private String pic;

    /**
     * 状态 1 正常 0 无效
     */
    private Integer status;

}
