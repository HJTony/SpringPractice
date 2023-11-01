package com.example.practice;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.function.Function;

@Configuration
public class AppConfig {

    @Bean
    public Function<String, PrototypeBean> beanFactory() {
        return this::prototypeBean;
    }
    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public PrototypeBean prototypeBean(String name) {
        return new PrototypeBean(name);
    }

    @Bean
    public SingletonBean singletonBean() {
        return new SingletonBean();
    }
}
