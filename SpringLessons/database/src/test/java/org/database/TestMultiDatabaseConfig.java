package org.database;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

//empty Configuration that scans thru the package "org.whySpring.componentsA"
@Configuration
@ComponentScan(basePackages = { "org.database" })
public class TestMultiDatabaseConfig {

    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;
   
    @Value("${spring.datasource.aurl}")
    private String aurl;
  
    @Value("${spring.datasource.burl}")
    private String burl;
  
    
    @Value("${spring.datasource.username}")
    private String user;
   
    @Value("${spring.datasource.password}")
    private String password;
   
    
    @Qualifier("dbA")
    @Bean
    public DataSource dataSourceA() {
        return dataSource(aurl);
    }
    
    @Qualifier("dbB")
    @Bean
    public DataSource dataSourceB() {
        return dataSource(burl);
    }
    
    
    public DataSource dataSource(String url) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);

        return dataSource;
    }

    @Qualifier("templateA")
    @Bean
    public JdbcTemplate getTemplateA(@Qualifier("dbA") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
    
    @Qualifier("templateB")
    @Bean
    public JdbcTemplate getTemplateB(@Qualifier("dbB") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}

