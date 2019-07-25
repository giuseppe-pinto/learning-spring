package com.giuseppe.pinto.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CountryPropsTest
{
  private static final String CONFIG_LOCATION = "country.xml";

  public static void main(String[] args)
  {
    ApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
    Country country = (Country) context.getBean("country");
    country.printCapitals();
  }
}