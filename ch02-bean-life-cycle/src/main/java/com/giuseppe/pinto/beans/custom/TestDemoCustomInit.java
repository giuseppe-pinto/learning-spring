package com.giuseppe.pinto.beans.custom;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemoCustomInit
{

  private static final String CONFIG_LOCATION = "bean_life_cycle.xml";

  public static void main(String[] args)
  {
    AbstractApplicationContext context =
      new ClassPathXmlApplicationContext(CONFIG_LOCATION);

    String id = "demoCustomInitId";
    DemoCustomInit customInit = (DemoCustomInit) context.getBean(id);

    System.out.println(customInit.toString());

    context.registerShutdownHook();

  }
}
