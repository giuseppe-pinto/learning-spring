package com.giuseppe.pinto.beans.xmlbased.setterinjection;

import com.giuseppe.pinto.beans.domain.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomerWithReferenceObject
{
  private static final String CONFIG_LOCATION = "beans-config-xmlbased.xml";

  public static void main(String[] args)
  {
    ApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
    Customer customer = (Customer) context.getBean("customerId");
    System.out.println(customer.toString());
  }
}
