package org.mockito.test_doubles.spy;

public class BookRepositorySpy implements BookRepository {

    int saveTimes = 0;
    Book lastAddedBook = null;

    @Override
    public void save(Book book) {
        saveTimes++;
        lastAddedBook = book;
    }

    public int timesCalledSaveMethod(){
        return saveTimes;
    }

    public boolean calledWith(Book book){
       return lastAddedBook.equals(book);
    }
}
