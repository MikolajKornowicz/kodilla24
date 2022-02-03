package com.kodilla.patterns.prototype.library;

import com.com.kodilla.patterns.library.Book;
import com.com.kodilla.patterns.library.Library;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks () {
        //given
        Library library = new Library("Original library");
        Book book1  = new Book("Title 1", "Author 1", LocalDate.now());
        Book book2  = new Book("Title 2", "Author 2", LocalDate.now());
        Book book3  = new Book("Title 3", "Author 3", LocalDate.now());
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        //when
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Shallow Cloned Library");
        }catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepClone();
            deepClonedLibrary.setName("Deep Cloned Library");
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }
        deepClonedLibrary.getBooks().remove(book3);
        //then
        System.out.println("Original library has " + library.getBooks().size() + " books");
        System.out.println("Shallow cloned library has " + clonedLibrary.getBooks().size() + " books");
        System.out.println("Deep cloned library has " + deepClonedLibrary.getBooks().size() + " books");
        Assertions.assertEquals(3, library.getBooks().size());
        Assertions.assertEquals(3, clonedLibrary.getBooks().size());
        Assertions.assertEquals(2, deepClonedLibrary.getBooks().size());
    }
}
