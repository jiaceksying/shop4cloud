package com.shop4j.cloud.leaf.dubbo.service;

import com.shop4j.cloud.api.leaf.dubbo.SegmentDubboService;
import com.shop4j.cloud.common.response.UnifiedResponse;
import com.shop4j.cloud.leaf.common.Result;
import com.shop4j.cloud.leaf.common.Status;
import com.shop4j.cloud.leaf.exception.LeafServerException;
import com.shop4j.cloud.leaf.exception.NoKeyException;
import com.shop4j.cloud.leaf.service.SegmentService;
import org.apache.dubbo.config.annotation.DubboService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

/**
 * @author ksying
 * @date 2023/3/12 16:34
 */
@DubboService
public class SegmentDubboServiceImpl implements SegmentDubboService {

    private static final Logger logger = LoggerFactory.getLogger(SegmentDubboServiceImpl.class);


    @Autowired
    private SegmentService segmentService;

    @Override
    public UnifiedResponse<Long> getSegmentId(String key) {
        return UnifiedResponse.success(get(key, segmentService.getId(key)));
    }


    private Long get(String key, Result id) {
        Result result;
        if (key == null || key.isEmpty()) {
            throw new NoKeyException();
        }
        result = id;
        if (Objects.equals(result.getStatus(), Status.EXCEPTION)) {
            throw new LeafServerException(result.toString());
        }
        return result.getId();
    }
}
