package com.giuseppe.pinto.beans.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DemoBeanPostProcessor implements BeanPostProcessor
{

  @Override
  public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException
  {
    System.out.println("initializing bean before init:-"+beanName);
    return bean;
  }

  @Override
  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException
  {
    System.out.println("initializing bean after init:-"+beanName);
    return bean;
  }

  @Override
  public String toString()
  {
    return "DemoBeanPostProcessor{}";
  }
}
