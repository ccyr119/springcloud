package org.ccy.springcloud.web;

import org.ccy.springcloud.pojo.Monster;
import org.ccy.springcloud.service.MonsterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class MonsterController {
    @Autowired
    MonsterService monsterService;

    @RequestMapping(value = "/monsters", method = RequestMethod.GET)
    public String list(Model model) {
        List<Monster> monsters = monsterService.listByFeign();
        model.addAttribute("monsters", monsters);
        return "monsters";
    }
}
