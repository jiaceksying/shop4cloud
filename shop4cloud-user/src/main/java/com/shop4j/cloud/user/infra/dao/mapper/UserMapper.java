package com.shop4j.cloud.user.infra.dao.mapper;

import com.shop4j.cloud.common.model.BaseMapper;
import com.shop4j.cloud.user.infra.dao.entity.UserDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<UserDO> {

}