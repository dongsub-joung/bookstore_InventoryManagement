package service;

import domain.Book;
import domain.User;

import java.util.ArrayList;

public interface serviceImple {
    public void addBook(Book book, User user);
    public void updateBook(User user);
    public void deleteBook(User user);
}
