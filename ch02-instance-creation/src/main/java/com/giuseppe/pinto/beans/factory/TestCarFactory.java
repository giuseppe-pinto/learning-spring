package com.giuseppe.pinto.beans.factory;

import com.giuseppe.pinto.beans.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCarFactory
{

  private static final String CONFIG_LOCATION = "config-instance.xml";

  public static void main(String[] args)
  {
    ApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
    Car car = (Car) context.getBean("carFromFactoryId");
    System.out.println(car.show());
  }

}
