package service;

import domain.Book;
import domain.User;

public interface BookserviceImple {
    public void addBook(Book book, User user);
    public void updateBook(User user);
    public void deleteBook(User user);
}
