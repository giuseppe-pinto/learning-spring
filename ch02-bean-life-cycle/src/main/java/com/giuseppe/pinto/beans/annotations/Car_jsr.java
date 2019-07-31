package com.giuseppe.pinto.beans.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Car_jsr
{
  private String chassisNumber, color, fuelType;
  private long price;
  private double average;

  public Car_jsr()
  {
  }

  @PostConstruct
  public void initCar(){
    System.out.println("initializing car");
    price=price*10;
  }

  @PreDestroy
  public void destroyCar(){
    System.out.println("demolishing car");
  }

  public void setChassisNumber(String chassisNumber)
  {
    this.chassisNumber = chassisNumber;
  }

  public void setColor(String color)
  {
    this.color = color;
  }

  public void setFuelType(String fuelType)
  {
    this.fuelType = fuelType;
  }

  public void setPrice(long price)
  {
    this.price = price;
  }

  public void setAverage(double average)
  {
    this.average = average;
  }

  @Override
  public String toString()
  {
    return "Car_jsr{" +
      "chassisNumber='" + chassisNumber + '\'' +
      ", color='" + color + '\'' +
      ", fuelType='" + fuelType + '\'' +
      ", price=" + price +
      ", average=" + average +
      '}';
  }
}
