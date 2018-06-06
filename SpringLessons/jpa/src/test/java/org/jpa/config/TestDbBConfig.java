package org.jpa.config;

import java.util.HashMap;


import javax.sql.DataSource;

import org.jpa.entities.dbA.DbAEntities;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.jpa.entities.dbB.*; 

@Configuration
@EnableJpaRepositories(
        basePackageClasses = org.jpa.repo.dbB.DbBRepositories.class  // eine Klasse aus dem Package mit den Repositories 
       , entityManagerFactoryRef = "dbBEntityManager"  // Name des EntityManagers 
       , transactionManagerRef = "dbBTransactionManager" // Name des Transaction Managers
    )

public class TestDbBConfig {

    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;
   
    @Value("${spring.datasource.burl}")
    private String url;
    
    @Value("${spring.datasource.username}")
    private String user;
   
    @Value("${spring.datasource.password}")
    private String password;
   
    @Value("${hibernate.hbm2ddl.auto}")
    private String hbm2ddl;
   
    @Value("${hibernate.dialect}")
    private String dialect;
   

    //  @Bean("dbBDatasource") muss nicht sein, aber kann eventuell für JdbcTemplate verwendet werde 
   public DataSource dbBdataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);

        return dataSource;
    }
    
  //  @Bean("dbBEntityManager") braucht man nicht, der Name oben reicht
    @Bean
    public LocalContainerEntityManagerFactoryBean dbBEntityManager() {
        LocalContainerEntityManagerFactoryBean em
          = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(dbBdataSource());
        em.setPackagesToScan(
          new String[] {  DbBEntities.class.getPackage().getName()  }); // Hier steht der Packagename zu den Entities
      /*  em.setPersistenceUnitName("dbB"); Muss nicht sein

        Muss nicht sein, braucht man aber, wenn man einen EntityManager injecten will
        
        @PersistenceContext(unitName = "dbB")
        private EntityManager entityManager;
       */
        
        HibernateJpaVendorAdapter vendorAdapter
          = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        HashMap<String, Object> properties = new HashMap<>();
        properties.put("hibernate.hbm2ddl.auto",
          hbm2ddl);
        properties.put("hibernate.dialect",
          dialect);
        em.setJpaPropertyMap(properties);
 
        return em;
    }
 
   // @Bean("dbBTransactionManager") braucht man nicht, der Name oben reicht
    @Bean
    public PlatformTransactionManager dbBTransactionManager() {
  
        JpaTransactionManager transactionManager
          = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(
          dbBEntityManager().getObject());
        return transactionManager;
    }
}

