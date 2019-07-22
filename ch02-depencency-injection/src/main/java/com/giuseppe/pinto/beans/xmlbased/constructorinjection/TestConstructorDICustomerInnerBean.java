package com.giuseppe.pinto.beans.xmlbased.constructorinjection;

import com.giuseppe.pinto.beans.domain.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructorDICustomerInnerBean
{
  private static final String CONFIG_LOCATION = "beans-config-inner.xml";

  public static void main(String[] args)
  {
    ApplicationContext context =
      new ClassPathXmlApplicationContext(CONFIG_LOCATION);
    String id = "customerIdWithInnerBeanConstructorInj";
    Customer customer = (Customer) context.getBean(id);
    System.out.println(customer.toString());
  }
}