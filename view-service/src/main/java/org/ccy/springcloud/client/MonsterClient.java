package org.ccy.springcloud.client;

import org.ccy.springcloud.pojo.Monster;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "DATA-SERVICE", fallback = MonsterClientFeignHystrix.class)
public interface MonsterClient {
    @GetMapping("/monsters")
    List<Monster> list();
}
