package edu.dmacc.books.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.dmacc.books.config.AppConfig;

public class BooksApplication {

	public static void main(String[] args) {
		@SuppressWarnings({ "unused", "resource" })
		ApplicationContext context2 = new AnnotationConfigApplicationContext(AppConfig.class);
	}
}
