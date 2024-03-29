package com.giuseppe.pinto.beans.contextaware;

import com.giuseppe.pinto.beans.initializing.DemoInitializingBean;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class DemoContextAwareBean implements ApplicationContextAware
{

  private ApplicationContext context;

  public DemoContextAwareBean()
  {
    System.out.println("context aware bean created");
  }

  @Override
  public void setApplicationContext(ApplicationContext context) throws BeansException
  {
    System.out.println("context set");
    this.context = context;
  }

  void display(){

    DemoInitializingBean bean = (DemoInitializingBean) context.getBean("demoInitializingBeanId");
    System.out.println(bean.toString());

  }

}
