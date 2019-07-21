package com.giuseppe.pinto.beans.applicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClasspathApplicationContext
{
  /*
    Sometimes, the application may have more than one configuration file in the classpath,
    and, accidentally, they may write the definition for the same bean.
    In such conditions where the application has more than one XML configuration file,
    the later bean definition from the XML file will override the earlier bean definition.
    It provides the advantage of writing a new bean definition to replace the previous one.
  */
  public static void main(String[] args)
  {

    ApplicationContext applicationContext =
      new ClassPathXmlApplicationContext("beans_classpath.xml");
    System.out.println("container created successfully from single config file");

    applicationContext =
      new ClassPathXmlApplicationContext("beans_classpath.xml", "another_beans_classpath.xml");
    System.out.println("container created successfully from multiple config files");
  }

}
