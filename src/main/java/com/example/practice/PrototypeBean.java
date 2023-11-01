package com.example.practice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PrototypeBean {

    private String name;

//    public PrototypeBean() {
//        log.info("Prototype instance create");
//    }
    public PrototypeBean(String name) {
        log.info("Prototype " + name + "instance create");
    }
}
