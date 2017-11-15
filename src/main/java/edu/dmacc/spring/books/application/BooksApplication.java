package edu.dmacc.spring.books.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.dmacc.spring.books.config.AppConfig;

public class BooksApplication {

	public static void main(String[] args) {
		ApplicationContext context2=new AnnotationConfigApplicationContext(AppConfig.class);
	}
}
