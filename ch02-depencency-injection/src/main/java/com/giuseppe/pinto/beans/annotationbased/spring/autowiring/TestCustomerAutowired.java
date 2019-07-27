package com.giuseppe.pinto.beans.annotationbased.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomerAutowired
{

  private static final String CONFIG_LOCATION = "beans-config-autowired-annotation.xml";

  public static void main(String[] args)
  {
    ApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
    CustomerAutowired customerAutowired = (CustomerAutowired) context.getBean("customerAutowired");
    System.out.println(customerAutowired.toString());
  }
}
