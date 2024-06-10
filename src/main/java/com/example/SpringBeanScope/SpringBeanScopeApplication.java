package com.example.SpringBeanScope;

import com.example.SpringBeanScope.beanConfig.MyBeanConfiguration;
import com.example.SpringBeanScope.beanConfig.PrototypeBean;
import com.example.SpringBeanScope.beanConfig.SingletonBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringBeanScopeApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBeanScopeApplication.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(MyBeanConfiguration.class);
		context.refresh();

//		Singleton Bean

		SingletonBean singletonBean = context.getBean(SingletonBean.class);
		System.out.println(singletonBean.hashCode());

		SingletonBean singletonBean1 = context.getBean(SingletonBean.class);
		System.out.println(singletonBean1.hashCode());


//		Prototype Bean

		PrototypeBean prototypeBean = context.getBean(PrototypeBean.class);
		System.out.println(prototypeBean.hashCode());

		PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);
		System.out.println(prototypeBean1.hashCode());

	}

}
