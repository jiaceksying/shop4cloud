package com.shop4j.cloud.common.model;

import java.util.List;

public interface BaseMapper<T extends BaseModel> {

    int deleteByPrimaryKey(Long id);

    int insert(T row);

    T selectByPrimaryKey(Long id);

    List<T> selectAll();

    int updateByPrimaryKey(T row);

}
