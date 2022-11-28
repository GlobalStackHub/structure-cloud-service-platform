package com.olympus.center.service.impl;

import com.olympus.center.remote.CloudProviderFeignService;
import com.olympus.center.service.CloudConsumerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author eddie.lys
 * @since 2022/11/28
 */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CloudConsumerServiceImpl implements CloudConsumerService {

    /**
     * 远程服务
     */
    private final CloudProviderFeignService cloudProviderFeignService;


    @Override
    public String remoteReturn() {
        return cloudProviderFeignService.test("测试");
    }
}
