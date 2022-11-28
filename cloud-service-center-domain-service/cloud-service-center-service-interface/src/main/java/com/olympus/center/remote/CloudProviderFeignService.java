package com.olympus.center.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author eddie.lys
 * @since 2022/11/28
 */
@FeignClient("cloud-service-provider-service.spring-kubernetes-cloud.svc.cluster.local:8080")
public interface CloudProviderFeignService {

    /**
     * 测试
     */
    @PostMapping(value = "/provider/test")
    String test(String a);

}
