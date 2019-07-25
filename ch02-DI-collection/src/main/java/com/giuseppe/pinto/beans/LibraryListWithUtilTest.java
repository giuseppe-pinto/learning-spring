package com.giuseppe.pinto.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryListWithUtilTest
{
  private static final String CONFIG_LOCATION = "book-list-util.xml";

  public static void main(String[] args)
  {
    ApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
    LibraryList libraryList = (LibraryList) context.getBean("libraryWithUtil");
    libraryList.displayBooks();
  }
}