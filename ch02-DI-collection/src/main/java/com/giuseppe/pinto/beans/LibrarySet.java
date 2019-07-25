package com.giuseppe.pinto.beans;

import java.util.Set;

public class LibrarySet
{
  private Set<Book> books;

  public Set<Book> getBooks()
  {
    return books;
  }

  public void setBooks(Set<Book> books)
  {
    this.books = books;
  }

  public void displayBooks(){
    books.forEach(book -> System.out.println(book.toString()));
  }
}