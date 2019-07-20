package com.giuseppe.pinto.beans.contextaware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemoContextAwareBean
{
  private static final String CONFIG_LOCATION = "bean_life_cycle.xml";

  public static void main(String[] args)
  {
    ApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);

    DemoContextAwareBean demoContextAwareBean = (DemoContextAwareBean) context.getBean("contextAwareBeanId");

    demoContextAwareBean.display();
  }
}
