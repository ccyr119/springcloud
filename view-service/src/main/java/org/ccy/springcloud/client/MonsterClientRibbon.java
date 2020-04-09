package org.ccy.springcloud.client;

import org.ccy.springcloud.pojo.Monster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class MonsterClientRibbon {
    @Autowired
    RestTemplate restTemplate;

    public List<Monster> list() {
        return restTemplate.getForObject("http://DATA-SERVICE/monsters", List.class);
    }
}
