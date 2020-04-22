package org.ccy.springcloud.web;

import org.ccy.springcloud.pojo.Monster;
import org.ccy.springcloud.service.MonsterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RefreshScope
public class MonsterController {
    @Value("${version}")
    String version;

    @Autowired
    MonsterService monsterService;

    @RequestMapping(value = "/monsters", method = RequestMethod.GET)
    public String list(Model model) {
        List<Monster> monsters = monsterService.listByFeign();
        model.addAttribute("monsters", monsters);
        model.addAttribute("version", version);
        return "monsters";
    }
}
