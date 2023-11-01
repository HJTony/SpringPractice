package com.example.practice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalTime;
import java.util.function.Function;

@Slf4j
public class SingletonBean {
    @Autowired
    private ObjectFactory<PrototypeBean> prototypeBeanObjectFactory;

    @Autowired
    private Function<String, PrototypeBean> beanFactory;

    public SingletonBean() {
        log.info("Singleton instance created");
    }

    public PrototypeBean getPrototypeBean() {
        log.info(String.valueOf(LocalTime.now()));
        return prototypeBeanObjectFactory.getObject();
    }

    public PrototypeBean getProtoTypeBeanWithFunction(String name) {
        return beanFactory.apply(name);
    }
}
