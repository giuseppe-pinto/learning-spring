package com.giuseppe.pinto.beans.annotationbased.spring.stereotype;

import com.giuseppe.pinto.beans.domain.Address;
import org.springframework.stereotype.Component;

@Component
//If you don't want to use as id the string "CostumerComponent" add this property to component annotation (value = "componentId")
public class CustomerComponent
{

  private String name;
  private int id;
  private Address address;

  public CustomerComponent()
  {
    id = 100;
    name = "pinco-pallo";
    address = new Address();
    address.setCityName("Milano");
    address.setBuildNumber(1212);
    address.setPinCode(8989);
  }

  @Override
  public String toString()
  {
    return "CustomerComponent{" +
      "name='" + name + '\'' +
      ", id=" + id +
      ", address=" + address +
      '}';
  }
}
