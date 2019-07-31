package com.giuseppe.pinto.beans.domain;

import com.giuseppe.pinto.beans.domain.Address;

public class CustomerReference
{
  private String customerName;
  private int customerId;
  private Address customerAddress;

  public String getCustomerName()
  {
    return customerName;
  }

  public void setCustomerName(String customerName)
  {
    this.customerName = customerName;
  }

  public int getCustomerId()
  {
    return customerId;
  }

  public void setCustomerId(int customerId)
  {
    this.customerId = customerId;
  }

  public Address getCustomerAddress()
  {
    return customerAddress;
  }

  public void setCustomerAddress(Address customerAddress)
  {
    this.customerAddress = customerAddress;
  }

  @Override
  public String toString() {
    return customerName + " is living at " + customerAddress;
  }
}