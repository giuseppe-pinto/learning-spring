package com.giuseppe.pinto.dao;

import com.giuseppe.pinto.beans.Book;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookDAOImpl implements BookDAO
{
  private DataSource dataSource;

  public BookDAOImpl(DataSource dataSource)
  {
    this.dataSource = dataSource;
  }

  @Override
  public int addBook(Book book)
  {
    int rows = 0;
    String INSERT_BOOK ="insert into book values(?,?,?,?,?,?)";

    try
    {
      Connection connection = dataSource.getConnection();

      PreparedStatement ps=
        connection.prepareStatement(INSERT_BOOK);

      ps.setLong(1,book.getISBN());
      ps.setString(2,book.getBookName());
      ps.setString(3,book.getPublication());
      ps.setInt(4,book.getPrice());
      ps.setString(5,book.getDescription());
      ps.setString(6,book.getAuthor());

      rows=ps.executeUpdate();
    }
    catch (SQLException e)
    {
      e.printStackTrace();
    }

    return rows;
  }
}
