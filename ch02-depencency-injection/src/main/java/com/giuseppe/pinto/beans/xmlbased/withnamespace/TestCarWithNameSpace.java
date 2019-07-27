package com.giuseppe.pinto.beans.xmlbased.withnamespace;

import com.giuseppe.pinto.beans.domain.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCarWithNameSpace
{
  private static final String CONFIG_LOCATION = "beans-config-namespace.xml";

  public static void main(String[] args)
  {
    ApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
    Car car = (Car) context.getBean("carId");
    System.out.println(car.show());
  }
}