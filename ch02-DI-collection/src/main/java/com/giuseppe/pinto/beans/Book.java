package com.giuseppe.pinto.beans;

import java.util.Objects;

public class Book
{
  private String isbn;
  private String name;
  private int price;
  private String publication;

  public Book(String isbn, String name, int price, String publication)
  {
    this.isbn = isbn;
    this.name = name;
    this.price = price;
    this.publication = publication;
  }

  public Book() { }

  public String getIsbn()
  {
    return isbn;
  }

  public String getName()
  {
    return name;
  }

  public int getPrice()
  {
    return price;
  }

  public String getPublication()
  {
    return publication;
  }

  public void setIsbn(String isbn)
  {
    this.isbn = isbn;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setPrice(int price)
  {
    this.price = price;
  }

  public void setPublication(String publication)
  {
    this.publication = publication;
  }

  @Override
  public boolean equals(Object o)
  {
    if (this == o)
    {
      return true;
    }
    if (o == null || getClass() != o.getClass())
    {
      return false;
    }
    Book book = (Book) o;
    return price == book.price &&
      Objects.equals(isbn, book.isbn) &&
      Objects.equals(name, book.name) &&
      Objects.equals(publication, book.publication);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(isbn, name, price, publication);
  }

  @Override
  public String toString()
  {
    return "Book{" +
      "isbn='" + isbn + '\'' +
      ", name='" + name + '\'' +
      ", price=" + price +
      ", publication='" + publication + '\'' +
      '}';
  }
}
