package com.giuseppe.pinto.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryMapTest
{
  private static final String CONFIG_LOCATION = "book-map.xml";

  public static void main(String[] args)
  {
    ApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
    LibraryMap libraryMap = (LibraryMap) context.getBean("libraryMap");
    libraryMap.displayBooks();
  }
}