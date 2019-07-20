package com.giuseppe.pinto.beans.initializing;

import org.springframework.beans.factory.InitializingBean;

public class DemoInitializingBean implements InitializingBean
{
  private String message,name;

  public DemoInitializingBean()
  {
    System.out.println("constructor gets called for initializing data members in demo Initializing bean");
    message="welcome!!!";
    name="blaze";
  }

  @Override
  public void afterPropertiesSet() throws Exception
  {
    name = "Mr." + name.toUpperCase();
    System.out.println("after properties set got called");
  }

  @Override
  public String toString()
  {
    return "DemoInitializingBean{" +
      "message='" + message + '\'' +
      ", name='" + name + '\'' +
      '}';
  }


}
