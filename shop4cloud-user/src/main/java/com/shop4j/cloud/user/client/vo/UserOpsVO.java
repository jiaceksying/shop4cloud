package com.shop4j.cloud.user.client.vo;

import com.shop4j.cloud.common.dto.BaseDTO;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.time.LocalDateTime;

/**
 * 用户相关 VO
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2023/3/21
 */
@Getter
@Setter
public class UserOpsVO extends BaseDTO {

    @Serial
    private static final long serialVersionUID = 914765547581388748L;

    /**
     * 主键ID
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

    /**
     * 创建时间
     */
    protected LocalDateTime createTime;

    /**
     * 更新时间
     */
    protected LocalDateTime updateTime;

}
