package com.giuseppe.pinto.beans.domain;

public class Customer
{

  private String name;
  private int id;
  private Address address;

  public Customer(String name, int id, Address address)
  {
    this.name = name;
    this.id = id;
    this.address = address;
  }

  public Customer()
  {
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public int getId()
  {
    return id;
  }

  public void setId(int id)
  {
    this.id = id;
  }

  public Address getAddress()
  {
    return address;
  }

  public void setAddress(Address address)
  {
    this.address = address;
  }

  @Override
  public String toString()
  {
    return "Customer{" +
      "name='" + name + '\'' +
      ", id=" + id +
      ", address=" + address +
      '}';
  }
}
