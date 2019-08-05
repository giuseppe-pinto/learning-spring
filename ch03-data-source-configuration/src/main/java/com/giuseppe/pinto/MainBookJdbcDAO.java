package com.giuseppe.pinto;

import com.giuseppe.pinto.beans.Book;
import com.giuseppe.pinto.config.BookJdbcConfiguration;
import com.giuseppe.pinto.dao.BookDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainBookJdbcDAO
{
  public static void main(String[] args)
  {
    ApplicationContext context = new AnnotationConfigApplicationContext(BookJdbcConfiguration.class);
    BookDAO bookDAO = (BookDAO) context.getBean("bookDAO");
    bookDAO.addBook(new Book());
  }

}
