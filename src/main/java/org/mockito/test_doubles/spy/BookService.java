package org.mockito.test_doubles.spy;

import java.util.Collection;

public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public void addBook(Book book){
        if(book.getPrice() < 1600){
            return;
        }
        bookRepository.save(book);
    }


}
