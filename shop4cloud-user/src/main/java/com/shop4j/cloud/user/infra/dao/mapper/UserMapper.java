package com.shop4j.cloud.user.infra.dao.mapper;

import com.shop4j.cloud.common.model.BaseMapper;
import com.shop4j.cloud.user.client.param.UserOpsQueryParam;
import com.shop4j.cloud.user.infra.dao.entity.UserDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<UserDO> {

    /**
     * 根据条件查询数据集合
     *
     * @param param 入参
     * @return 集合
     */
    List<UserDO> selectByParam(UserOpsQueryParam param);

    /**
     * 根据条件查询总数量
     *
     * @param param 入参
     * @return 数量
     */
    Long countByParam(UserOpsQueryParam param);

}