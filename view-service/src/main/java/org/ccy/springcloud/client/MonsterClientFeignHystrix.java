package org.ccy.springcloud.client;

import org.ccy.springcloud.pojo.Monster;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MonsterClientFeignHystrix implements MonsterClient {
    @Override
    public List<Monster> list() {
        List<Monster> result = new ArrayList<>();
        result.add(new Monster(0,"产品数据微服务不可用"));
        return result;
    }
}
