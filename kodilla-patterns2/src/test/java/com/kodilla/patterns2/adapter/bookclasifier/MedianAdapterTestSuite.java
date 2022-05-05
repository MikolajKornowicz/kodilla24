package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest(){
        //given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("author", "Title", 1999,"aT1999" ));
        bookSet.add(new Book("author1", "Title1", 2000,"aT1912" ));
        bookSet.add(new Book("author2", "Title2", 2010,"at222" ));
        bookSet.add(new Book("author3", "Title3", 1985,"aT99" ));
        bookSet.add(new Book("author4", "Title4", 1987,"T1999" ));
        bookSet.add(new Book("author5", "Title5", 2022,"a999" ));
        MedianAdapter medianAdapter = new MedianAdapter();

        //when
        int median = medianAdapter.publicationYearMedian(bookSet);
        //then
        assertEquals(2000, median);
    }

}