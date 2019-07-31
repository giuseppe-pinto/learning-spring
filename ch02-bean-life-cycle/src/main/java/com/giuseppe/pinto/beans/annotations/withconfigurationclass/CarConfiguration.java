package com.giuseppe.pinto.beans.annotations.withconfigurationclass;


import com.giuseppe.pinto.beans.annotations.Car_jsr;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfiguration
{
  @Bean(name = "carJsrId")
  public Car_jsr myCar(){
    Car_jsr car = new Car_jsr();
    car.setAverage(20d);
    car.setChassisNumber("chassis");
    car.setColor("green");
    car.setFuelType("Diesel");
    car.setPrice(30000);
    return car;
  }
}
