package com.giuseppe.pinto.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryListTest
{

  private static final String CONFIG_LOCATION = "book-list.xml";

  public static void main(String[] args)
  {
    ApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
    LibraryList library = (LibraryList) context.getBean("libraryList");
    library.displayBooks();
  }
}
