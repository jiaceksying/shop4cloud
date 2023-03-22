package com.shop4j.cloud.user.client.param;

import com.shop4j.cloud.common.database.dto.PageDTO;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

/**
 * 用户后台分页查询
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2023/3/22
 */
@Getter
@Setter
public class UserOpsQueryParam extends PageDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1232660368163346863L;

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

}