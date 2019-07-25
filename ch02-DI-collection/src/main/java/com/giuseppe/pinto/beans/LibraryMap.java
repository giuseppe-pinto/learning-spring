package com.giuseppe.pinto.beans;

import java.util.Map;

public class LibraryMap
{
  private Map<String, Book> bookMap;

  public Map<String, Book> getBookMap()
  {
    return bookMap;
  }

  public void setBookMap(Map<String, Book> bookMap)
  {
    this.bookMap = bookMap;
  }

  public void displayBooks(){
    bookMap.forEach((key, value) -> System.out.println(value.toString()));
  }
}