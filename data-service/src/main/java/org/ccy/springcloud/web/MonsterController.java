package org.ccy.springcloud.web;

import org.ccy.springcloud.pojo.Monster;
import org.ccy.springcloud.service.MonsterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MonsterController {
    @Autowired
    MonsterService monsterService;

    @GetMapping("/monsters")
    public List<Monster> list() {
        List<Monster> monsters = monsterService.list();
        return monsters;
    }
}
