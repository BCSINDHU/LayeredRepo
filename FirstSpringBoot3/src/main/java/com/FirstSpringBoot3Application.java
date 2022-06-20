package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.entity.Coder7;

@SpringBootApplication
public class FirstSpringBoot3Application {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(FirstSpringBoot3Application.class, args);
		System.out.println("Welcome to Spring Boot");
		
		Coder7 c1=(Coder7) ctx.getBean("coder7");
		c1.setCid(102);
		c1.setCname("Mina");
		c1.setTech("Java");
		
		System.out.println(c1);
		System.out.println(c1.hashCode());
		
		Coder7 c2=(Coder7) ctx.getBean("coder7");
		c2.setCid(103);
		c2.setCname("Pia");
		c2.setTech("JavaFS");
		
		System.out.println(c2);
		System.out.println(c2.hashCode());	
	}
}
