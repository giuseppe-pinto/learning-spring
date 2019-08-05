package com.giuseppe.pinto.config;

import com.giuseppe.pinto.dao.BookDAO;
import com.giuseppe.pinto.dao.BookDAOImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class BookConfiguration
{

  @Bean
  public DataSource dataSource(){
    DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
    driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/bookDB?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
    driverManagerDataSource.setUsername("root");
    driverManagerDataSource.setPassword("root");
    return driverManagerDataSource;
  }

  @Bean
  public BookDAO bookDAO(DataSource dataSource){
    return new BookDAOImpl(dataSource);
  }

}