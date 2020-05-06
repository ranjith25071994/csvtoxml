package com.hicap.springbatch;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Main {

	@SuppressWarnings("resource")
	public static void main(String areg[]){
		ApplicationContext context = new ClassPathXmlApplicationContext("job-config.xml");

	}

}
