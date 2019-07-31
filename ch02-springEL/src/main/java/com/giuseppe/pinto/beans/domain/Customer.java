package com.giuseppe.pinto.beans.domain;

public class Customer
{

  private String customerName;
  private String customerId;
  private boolean secondHanded;
  private double prodPrice;
  private String prodName;

  public String getCustomerName()
  {
    return customerName;
  }

  public void setCustomerName(String customerName)
  {
    this.customerName = customerName;
  }

  public String getCustomerId()
  {
    return customerId;
  }

  public void setCustomerId(String customerId)
  {
    this.customerId = customerId;
  }

  public boolean isSecondHanded()
  {
    return secondHanded;
  }

  public void setSecondHanded(boolean secondHanded)
  {
    this.secondHanded = secondHanded;
  }

  public double getProdPrice()
  {
    return prodPrice;
  }

  public void setProdPrice(double prodPrice)
  {
    this.prodPrice = prodPrice;
  }

  public String getProdName()
  {
    return prodName;
  }

  public void setProdName(String prodName)
  {
    this.prodName = prodName;
  }

  @Override
  public String toString()
  {
    return "Customer{" +
      "customerName='" + customerName + '\'' +
      ", customerId='" + customerId + '\'' +
      ", secondHanded=" + secondHanded +
      ", prodPrice=" + prodPrice +
      ", prodName='" + prodName + '\'' +
      '}';
  }
}
