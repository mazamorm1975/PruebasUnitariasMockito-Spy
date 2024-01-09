package org.mockito.test_doubles.spy;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestDoubleSpy {

    @Test
    public void DemoSpyWithoutMockito() {
        BookRepositorySpy bookRepository = new BookRepositorySpy();
        BookService bookService = new BookService(bookRepository);

        Book book1 = new Book("1", "Mockito in Three minutes", LocalDate.now(), 1500);
        Book book2 = new Book("2", "Maven for dummies", LocalDate.now(), 8500);

        bookService.addBook(book1);
        bookService.addBook(book2);

        assertEquals(2, bookRepository.timesCalledSaveMethod());
        assertTrue(bookRepository.calledWith(book2));

    }

}
