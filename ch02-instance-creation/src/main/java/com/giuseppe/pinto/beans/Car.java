package com.giuseppe.pinto.beans;

public class Car
{
  private String chassisNumber, color, fuelType;
  private long price;
  private double average;

  public Car()
  {
    this.chassisNumber = "chassisNumber";
    this.color = "color";
    this.fuelType = "fuelType";
    this.price = 90L;
    this.average = 30d;
  }

  public String show()
  {
    System.out.println("Some Business Logic");
    return "Car{" +
      "chassisNumber='" + chassisNumber + '\'' +
      ", color='" + color + '\'' +
      ", fuelType='" + fuelType + '\'' +
      ", price=" + price +
      ", average=" + average +
      '}';
  }

}