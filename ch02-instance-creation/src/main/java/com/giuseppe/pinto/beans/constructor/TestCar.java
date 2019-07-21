package com.giuseppe.pinto.beans.constructor;

import com.giuseppe.pinto.beans.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCar
{
  private static final String CONFIG_LOCATION = "config-instance.xml";

  public static void main(String[] args)
  {
    ApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
    Car bean = (Car) context.getBean("carId");
    System.out.println(bean.show());
  }
}
