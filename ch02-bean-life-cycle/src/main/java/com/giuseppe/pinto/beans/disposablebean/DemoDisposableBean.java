package com.giuseppe.pinto.beans.disposablebean;

import org.springframework.beans.factory.DisposableBean;

public class DemoDisposableBean implements DisposableBean
{
  private String message, name;

  public DemoDisposableBean()
  {
    System.out.println("constructor gets called for initializing data members in Disposable Bean");
    message = "welcome!!!";
    name = "no name";
  }

  @Override
  public void destroy() throws Exception
  {
    System.out.println("destroy from disposable bean get called");
    name = null;
  }

  @Override
  public String toString()
  {
    return "DemoDisposableBean{" +
      "message='" + message + '\'' +
      ", name='" + name + '\'' +
      '}';
  }
}