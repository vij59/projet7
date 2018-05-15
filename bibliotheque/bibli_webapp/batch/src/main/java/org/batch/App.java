package org.batch;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/batchContext.xml");
		// new
		// ClassPathXmlApplicationContext(this.getClass().getResource("/spring.xml").getPath());
		// new FileSystemXmlApplicationContext("/src/main/resources/batchContext.xml");
		System.out.println("Bye World!");
	}
}
