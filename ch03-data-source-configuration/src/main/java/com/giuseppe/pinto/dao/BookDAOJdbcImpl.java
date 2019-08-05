package com.giuseppe.pinto.dao;

import com.giuseppe.pinto.beans.Book;
import org.springframework.jdbc.core.JdbcTemplate;

public class BookDAOJdbcImpl implements BookDAO
{
  private final JdbcTemplate jdbcTemplate;

  public BookDAOJdbcImpl(JdbcTemplate jdbcTemplate)
  {
    this.jdbcTemplate = jdbcTemplate;
  }

  @Override
  public int addBook(Book book)
  {
    int rows = 0;
    String INSERT_BOOK = "insert into book values(?,?,?,?,?,?)";

    rows=jdbcTemplate.update(
      INSERT_BOOK,
      book.getISBN(),
      book.getBookName(),
      book.getPublication(),
      book.getPrice(),book.getDescription(),
      book.getAuthor());

    return rows;
  }

}