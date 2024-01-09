package org.mockito.test_doubles.spy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    private String id;
    private String titleBook;
    private LocalDate publishedDate;
    private int price;

}
