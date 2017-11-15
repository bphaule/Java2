package edu.dmacc.spring.books.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.dmacc")
public class AppConfig {
	
	@Bean
	EntityManagerFactory entityManagerFactory()
	{
		return Persistence.createEntityManagerFactory("Books");
	}
	
	
	@Bean
	EntityManager entityManager()
	{
		EntityManagerFactory emf = entityManagerFactory();
		return emf.createEntityManager();
	}
}
