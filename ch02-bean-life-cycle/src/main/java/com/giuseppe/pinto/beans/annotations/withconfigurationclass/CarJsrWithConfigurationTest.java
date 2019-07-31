package com.giuseppe.pinto.beans.annotations.withconfigurationclass;

import com.giuseppe.pinto.beans.annotations.Car_jsr;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarJsrWithConfigurationTest
{
  public static void main(String[] args)
  {
    ApplicationContext context = new AnnotationConfigApplicationContext(CarConfiguration.class);
    Car_jsr car = (Car_jsr) context.getBean("carJsrId");
    System.out.println(car.toString());
  }

}
