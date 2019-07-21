package com.giuseppe.pinto.beans.xmlbasedwithnamespace;

import com.giuseppe.pinto.beans.domain.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomerWithReferenceObjAndNameSpace
{
  private static final String CONFIG_LOCATION = "beans-config-namespace.xml";

  public static void main(String[] args)
  {
    ApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
    String id = "customerWithNamespaceId";
    Customer customer = (Customer) context.getBean(id);
    System.out.println(customer.toString());
  }
}
