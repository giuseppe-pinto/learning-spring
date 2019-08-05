package com.giuseppe.pinto;

import com.giuseppe.pinto.beans.Book;
import com.giuseppe.pinto.config.BookConfiguration;
import com.giuseppe.pinto.dao.BookDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainBookDAO
{
  public static void main(String[] args)
  {
    ApplicationContext context = new AnnotationConfigApplicationContext(BookConfiguration.class);

    BookDAO bookDAO = (BookDAO) context.getBean("bookDAO");

    int row = bookDAO.addBook(new Book(55535200,
      "TDD",
      "publication",
      50,
      "Il mio libro tratta TDD",
      "Fabrizio Maurizio"));

    if(row>0)
    {
      System.out.println("book inserted successfully");
    }
    else{
      System.out.println("SORRY!cannot add book");
    }
  }
}