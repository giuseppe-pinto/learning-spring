package com.giuseppe.pinto.beans.factory;

import com.giuseppe.pinto.beans.Car;

public class CarFactory
{
  private static Car car = new Car();

  public Car buildCar(){
    System.out.println("Building a car");
    return car;
  }
}