package com.example.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;

//@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {
//		SpringApplication.run(PracticeApplication.class, args);
		var c = new AnnotationConfigApplicationContext(AppConfig.class);


		var firstSingleton = c.getBean(SingletonBean.class);
//		var firstPrototype = firstSingleton.getPrototypeBean();
		var firstPrototypeWithName = firstSingleton.getProtoTypeBeanWithFunction("user1");

		var secondSingleton = c.getBean(SingletonBean.class);
//		var secondPrototype = firstSingleton.getPrototypeBean();
		var secondPrototypeWithName = secondSingleton.getProtoTypeBeanWithFunction("user2");

		Assert.isTrue(firstPrototypeWithName != secondPrototypeWithName, "not match");
	}

}
