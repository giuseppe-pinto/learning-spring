package com.giuseppe.pinto.beans.xmlbased.scope;

import com.giuseppe.pinto.beans.domain.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScopeCar
{

  private static final String CONFIG_LOCATION = "beans-config-scope.xml";

  public static void main(String[] args)
  {
    ApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);

    Car firstCarWithoutScope = (Car) context.getBean("carWithoutScope");
    Car secondCarWithoutScope = (Car) context.getBean("carWithoutScope");

    System.out.println("Car without scope from spring context");

    System.out.println(firstCarWithoutScope.show());
    System.out.println(secondCarWithoutScope.show());

    System.out.println("Changing a single car value");
    firstCarWithoutScope.setColor("Green");
    firstCarWithoutScope.setFuelType("gas");
    System.out.println(firstCarWithoutScope.show());
    System.out.println(secondCarWithoutScope.show());

    Car firstCarWithScope = (Car) context.getBean("carWithScope");
    Car secondCarWithScope = (Car) context.getBean("carWithScope");

    System.out.println("Car with scope from spring context");
    System.out.println(firstCarWithScope.show());
    System.out.println(secondCarWithScope.show());

    System.out.println("Changing a single car value");
    firstCarWithScope.setFuelType("Gas");
    firstCarWithScope.setColor("Pink");
    System.out.println(firstCarWithScope.show());
    System.out.println(secondCarWithScope.show());

  }
}
