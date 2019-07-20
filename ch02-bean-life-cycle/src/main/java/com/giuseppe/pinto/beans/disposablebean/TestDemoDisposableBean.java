package com.giuseppe.pinto.beans.disposablebean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemoDisposableBean
{

  private static final String CONFIG_LOCATION = "bean_life_cycle.xml";

  public static void main(String[] args)
  {
    ApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);

    DemoDisposableBean disposableBean = (DemoDisposableBean) context.getBean("disposableBeanId");

    ((AbstractApplicationContext) context).registerShutdownHook();
  }

}
