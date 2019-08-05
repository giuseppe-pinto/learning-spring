package com.giuseppe.pinto.config;

import com.giuseppe.pinto.dao.BookDAO;
import com.giuseppe.pinto.dao.BookDAOJdbcImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class BookJdbcConfiguration
{
  @Bean
  public DataSource dataSource (){
    DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
    driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/bookDB?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
    driverManagerDataSource.setUsername("root");
    driverManagerDataSource.setPassword("root");
    return driverManagerDataSource;
  }

  @Bean
  public JdbcTemplate jdbcTemplate(DataSource dataSource){
    return new JdbcTemplate(dataSource);
  }

  @Bean
  public BookDAO bookDAO(JdbcTemplate jdbcTemplate){
    return new BookDAOJdbcImpl(jdbcTemplate);
  }

}