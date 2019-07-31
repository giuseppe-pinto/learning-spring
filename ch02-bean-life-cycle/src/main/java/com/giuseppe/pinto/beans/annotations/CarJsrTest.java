package com.giuseppe.pinto.beans.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarJsrTest
{
  private static final String CONFIG_LOCATION = "bean-jsr-annotation.xml";

  public static void main(String[] args)
  {
    ApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
    Car_jsr car_jsr = (Car_jsr) context.getBean("carId");
    System.out.println(car_jsr.toString());
    ((AbstractApplicationContext) context).registerShutdownHook();
  }
}
