package com.giuseppe.pinto.beans.annotationbased.spring.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomerComponent
{

  private static final String CONFIG_LOCATION = "beans-config-sterotype-annotations.xml";

  public static void main(String[] args)
  {
    ApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
    CustomerComponent customerComponent = (CustomerComponent) context.getBean("customerComponent");
    System.out.println(customerComponent.toString());
  }

}