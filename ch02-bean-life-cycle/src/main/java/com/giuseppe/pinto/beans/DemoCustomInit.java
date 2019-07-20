package com.giuseppe.pinto.beans;

public class DemoCustomInit
{
  private String message,name;

  public DemoCustomInit()
  {
    System.out.println("constructor gets called for initializing data members in Custom init");
    message="welcome!!!";
    name="blaze";
  }

  @Override
  public String toString()
  {
    return "DemoCustomInit{" +
      "message='" + message + '\'' +
      ", name='" + name + '\'' +
      '}';
  }

  public void myInit(){
    name = name.toUpperCase();
    System.out.println("MyInit get called");
  }

  public void myDestroy(){
    name = null;
    System.out.println("destroy called");
  }

}