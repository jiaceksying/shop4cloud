package com.shop4j.cloud.api.leaf.dubbo;

import com.shop4j.cloud.common.response.UnifiedResponse;

/**
 * @author ksying
 * @date 2023/3/12 16:05
 */
public interface SegmentDubboService {
    UnifiedResponse<Long> getSegmentId(String key);
}
