package com.giuseppe.pinto.beans;

import com.giuseppe.pinto.beans.domain.Customer;
import com.giuseppe.pinto.beans.domain.CustomerReference;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLiterals
{
  private static final String CONFIG_LOCATION = "beans.xml";

  public static void main(String[] args)
  {
    ApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
    Customer customer = (Customer) context.getBean("customerId");
    System.out.println(customer.toString());

    CustomerReference customerReference = (CustomerReference) context.getBean("customerReferenceId");
    System.out.println(customerReference.toString());

    Customer customerCalculation = (Customer) context.getBean("customerCalculationId");
    System.out.println(customerCalculation.toString());
  }
}
