package org.ccy.springcloud.pojo;

import lombok.Data;

@Data
public class Monster {
    int id;
    String name;

    public Monster(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
