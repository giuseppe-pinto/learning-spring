package com.giuseppe.pinto.beans.annotationbased.spring.autowiring;

import com.giuseppe.pinto.beans.domain.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerAutowired
{
  private String name;
  private int id;

  //@Qualifier("customerAddressAutowired") Non serve il qualifier
  // perche il TestCustomerAutowired ha una unica configuration da dare al contesto.
  // Quindi non ci saranno conflitti. Anche se l'ide da rosso non è un problema.
  // Se gli dai un xml mirato ovviamente.
  @Autowired// (required = false) puoi settare questa proprieta a false se il field
  // puo esser opzionale (Spring setterà l oggetto a null).
  // Senza il req a false, se non si mette il bean nella config, spring si incazza.
  // Il default è a true.
  private Address address;

  public CustomerAutowired()
  {
    id = 100;
    name = "customer-autowired";
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