package org.practice.spring.SpringDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "org.practice.spring.SpringDemo" })
public class AppConfig {

	@Bean
	public Person person() {
		Person person=new Person();
		person.setAge(10);
		return person;
	}
}
