package com.olympus.center;

import com.olympus.center.service.CloudConsumerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author eddie.lys
 * @since 2022/11/28
 */
@Slf4j
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ServiceController {

    /**
     * 云服务消费服务
     */
    private final CloudConsumerService cloudConsumerService;

    @PostMapping("/test")
    public String addMaterielCategory() {
        return cloudConsumerService.remoteReturn();
    }
}
