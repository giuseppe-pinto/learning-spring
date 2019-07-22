package com.giuseppe.pinto.beans.xmlbased.setterinjection;

import com.giuseppe.pinto.beans.domain.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomerInnerBean
{

  private static final String CONFIG_LOCATION = "beans-config-inner.xml";

  public static void main(String[] args)
  {
    ApplicationContext context =
      new ClassPathXmlApplicationContext(CONFIG_LOCATION);
    String id = "customerIdWithInnerBeanSetterInj";
    Customer customer = (Customer) context.getBean(id);
    System.out.println(customer.toString());
  }

}