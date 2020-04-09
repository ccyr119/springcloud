package org.ccy.springcloud.service;

import org.ccy.springcloud.pojo.Monster;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MonsterService {
    @Value("${server.port}")
    String port;

    public List<Monster> list() {
        List<Monster> monsters = new ArrayList<>();
        monsters.add(new Monster(1, "普通怪物A from" + port));
        monsters.add(new Monster(2, "普通怪物B from" + port));
        monsters.add(new Monster(3, "普通怪物C from" + port));
        return monsters;
    }
}
