package org.ccy.springcloud.service;

import org.ccy.springcloud.client.MonsterClient;
import org.ccy.springcloud.client.MonsterClientRibbon;
import org.ccy.springcloud.pojo.Monster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonsterService {
    @Autowired
    MonsterClientRibbon monsterClientRibbon;

    @Autowired
    MonsterClient monsterClient;

    public List<Monster> listByRibbon() {
        return monsterClientRibbon.list();
    }

    public List<Monster> listByFeign() {
        return monsterClient.list();
    }
}
