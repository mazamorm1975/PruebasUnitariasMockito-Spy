package org.mockito.test_doubles.spy;

public class BookRepositorySpy implements BookRepository {

    int vecesSalvado = 0;

    Book latesBookAdded = null;
    @Override
    public void save(Book book) {
        vecesSalvado++;
        latesBookAdded = book;
    }

    public int timesCalledSaveMethod(){
        return vecesSalvado;
    }

    public boolean isTheLatestBookAdded(Book book){
        return latesBookAdded.equals(book);
    }
}
