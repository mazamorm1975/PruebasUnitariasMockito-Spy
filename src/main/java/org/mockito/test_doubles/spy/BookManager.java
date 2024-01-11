package org.mockito.test_doubles.spy;

public class BookManager {

    private BookService bookService;

    public BookManager(BookService bookService) {
        this.bookService = bookService;
    }

    public int getAppliedDiscount(String bookId, int discount){
       Book book =  bookService.findBook(bookId);
       int bookDiscount = bookService.getAppliedOnDiscount(book, discount);
       return  bookDiscount;
    }






}
