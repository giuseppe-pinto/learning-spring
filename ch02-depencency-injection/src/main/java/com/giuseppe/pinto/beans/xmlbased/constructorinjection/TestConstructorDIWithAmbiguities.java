package com.giuseppe.pinto.beans.xmlbased.constructorinjection;

import com.giuseppe.pinto.beans.xmlbased.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructorDIWithAmbiguities
{
  private static final String CONFIG_LOCATION = "beans-config.xml";

  public static void main(String[] args)
  {
    ApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
    String id = "constructorInjectionCarWithAmbiguitiesId";
    Car car = (Car) context.getBean(id);
    System.out.println(car.show());
  }
}