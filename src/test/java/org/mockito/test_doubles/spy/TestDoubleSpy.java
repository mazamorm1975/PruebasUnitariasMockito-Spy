package org.mockito.test_doubles.spy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class TestDoubleSpy {

    @Test
    public void demoMockSpy(){
        BookRepositorySpy bookRepositorySpy = new BookRepositorySpy();
     //   BookService bookService = new BookService(bookRepositorySpy);

        Book book1 = new Book("1","Mockito in three minutes", LocalDate.now(), 1500);
        Book book2 = new Book("2","Maven for dummies", LocalDate.now(), 1900);

       // bookService.addBook(book1);
        //bookService.addBook(book2);

        assertEquals(1, bookRepositorySpy.timesCalledSaveMethod());
        assertTrue(bookRepositorySpy.isTheLatestBookAdded(book2));

    }
    @InjectMocks
    private BookManager bookManager;

    @Mock
    private BookService bookService;

    @Test
    public void demoSpyWithMockito(){


        Book book1 = new Book("1","Mockito in three minutes", LocalDate.now(), 1500);
        doReturn(book1).when(bookService).findBook("1");
        int appliedDiscount = bookManager.getAppliedDiscount("1", 10);
        assertEquals(145,appliedDiscount);
    }


}
