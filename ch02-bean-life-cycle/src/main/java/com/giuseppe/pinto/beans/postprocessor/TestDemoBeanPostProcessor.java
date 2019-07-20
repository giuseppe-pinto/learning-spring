package com.giuseppe.pinto.beans.postprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemoBeanPostProcessor
{
  private static final String CONFIG_LOCATION = "bean_life_cycle.xml";

  public static void main(String[] args)
  {
    ApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
    DemoBeanPostProcessor beanPostProcessor = (DemoBeanPostProcessor) context.getBean("beanPostProcessorId");
    System.out.println(beanPostProcessor.toString());
  }
}
