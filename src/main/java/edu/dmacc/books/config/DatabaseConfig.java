package edu.dmacc.books.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.EclipseLinkJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.jta.JtaTransactionManager;

@Configuration
public class DatabaseConfig {
	


    @Bean
    public PlatformTransactionManager transactionManager(final EntityManagerFactory emf) {
        final JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(emf);
        return transactionManager;
    }

    @Bean
    public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
        return new PersistenceExceptionTranslationPostProcessor();
}
	   
	   @Bean
	   public LocalContainerEntityManagerFactoryBean  entityManagerFactory() {
		   LocalContainerEntityManagerFactoryBean  em = new LocalContainerEntityManagerFactoryBean();
	      em.setDataSource(dataSource());
	      em.setPackagesToScan(new String[] { "edu.dmacc.books.books.data","edu.dmacc.books.borrower.data" });
	 
	      JpaVendorAdapter vendorAdapter = new EclipseLinkJpaVendorAdapter();
	      em.setJpaVendorAdapter(vendorAdapter);     
	      em.setJpaProperties(properties());
	 
	      return em;
	   }
	 
	   @Bean
	   public DataSource dataSource(){
	      DriverManagerDataSource dataSource = new DriverManagerDataSource();
	      dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	      dataSource.setUrl("jdbc:mysql://mysql.us.cloudlogin.co:3306/hydroplane72_bok");
	      dataSource.setUsername( "hydroplane72_bok" );
	      dataSource.setPassword( "Java2Pass" );
	      return dataSource;
	   }
	   
	   Properties properties(){
		  Properties properties = new Properties();
		  properties.setProperty("eclipselink.weaving", "false");
		  return properties;
	   }

}
