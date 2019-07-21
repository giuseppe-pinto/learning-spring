package com.giuseppe.pinto.beans.xmlbased.setterinjection;

import com.giuseppe.pinto.beans.domain.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCar
{
  private static final String CONFIG_LOCATION = "beans-config-xmlbased.xml";

  public static void main(String[] args)
  {
    ApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
    Car car = (Car) context.getBean("setterInjectionCarId");
    System.out.println(car.show());
  }
}