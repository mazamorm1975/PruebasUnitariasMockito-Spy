package org.mockito.test_doubles.spy;

import java.util.Collection;

public class BookService {

    //private BookRepository bookRepository;

    private BookManager bookManager;
    public BookService (BookManager bookManager){
        this.bookManager = bookManager;
    }
//    public BookService(BookRepository bookRepository){
  //      this.bookRepository = bookRepository;
   // }

    public void addBook(Book book){
        if(book.getPrice() < 1600){
            return;
        }
   //     bookRepository.save(book);
    }

    public Book findBook(String bookId){
      //  throw new RuntimeException("Method not called");
    return null;
    }


    public int getAppliedOnDiscount(Book book, int discount) {
        int discountRate = book.getPrice();
        int newPrice = discountRate - (discountRate * discount / 100);
        return newPrice;
    }
}
