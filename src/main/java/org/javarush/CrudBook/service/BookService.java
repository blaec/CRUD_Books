package org.javarush.CrudBook.service;

import org.javarush.CrudBook.model.Book;

import java.util.List;

public interface BookService {
    public void addBook(Book book);
    public void updateBook(Book book);
    public void removeBook(int id);
    public void makeRead(boolean isUpdate, Book book);
    public Book getBookById(int id);
    public List<Book> listBooks();
    public Book getBookByName(String searchName);
}
