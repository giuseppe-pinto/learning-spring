package com.giuseppe.pinto.beans.xmlbased.reference.domain;

public class Address
{
  private String cityName;
  private int buildNumber;
  private long pinCode;

  public String getCityName()
  {
    return cityName;
  }

  public void setCityName(String cityName)
  {
    this.cityName = cityName;
  }

  public int getBuildNumber()
  {
    return buildNumber;
  }

  public void setBuildNumber(int buildNumber)
  {
    this.buildNumber = buildNumber;
  }

  public long getPinCode()
  {
    return pinCode;
  }

  public void setPinCode(long pinCode)
  {
    this.pinCode = pinCode;
  }

  @Override
  public String toString()
  {
    return "Address{" +
      "cityName='" + cityName + '\'' +
      ", buildNumber=" + buildNumber +
      ", pinCode=" + pinCode +
      '}';
  }
}
