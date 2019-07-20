package com.giuseppe.pinto.beans.initializingbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemoInitializingBean
{

  private static final String CONFIG_LOCATION = "bean_life_cycle.xml";

  public static void main(String[] args)
  {

    ApplicationContext context =
      new ClassPathXmlApplicationContext(CONFIG_LOCATION);

    DemoInitializingBean bean = (DemoInitializingBean) context.getBean("demoInitializingBeanId");

    System.out.println(bean.toString());

  }

}
