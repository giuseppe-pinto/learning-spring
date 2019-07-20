package com.giuseppe.pinto.beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestBeanFactory
{
  //BeanFactory doesn't support multiple configuration files.

  public static void main(String[] args)
  {
    BeanFactory beanFactory =
      new XmlBeanFactory(
        new ClassPathResource("beans_classpath.xml"));
    System.out.println("beanfactory created successfully");
  }

}