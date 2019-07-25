package com.giuseppe.pinto.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibrarySetTest
{
  private static final String CONFIG_LOCATION = "book-set.xml";

  public static void main(String[] args)
  {
    ApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
    LibrarySet librarySet = (LibrarySet) context.getBean("librarySet");
    librarySet.displayBooks();
  }

}