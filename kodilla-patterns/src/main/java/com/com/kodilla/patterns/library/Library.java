package com.com.kodilla.patterns.library;

import java.util.HashSet;
import java.util.Set;

public class Library extends Prototype<Library>{
    String name;
    Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public String setName (String newName){
        return name = newName;
    }

    public Library shallowCopy () throws CloneNotSupportedException {
        return super.clone();
    }

    public Library deepClone () throws  CloneNotSupportedException{
        Library clonedLibrary = super.clone();
        clonedLibrary.books = new HashSet<>();
        for (Book bookSet : books) {
            Book clonedBook = new Book(bookSet.getTitle(), bookSet.getAuthor(), bookSet.getPublicationDate());
            clonedLibrary.books.add(clonedBook);
        }
        return clonedLibrary;
    }
}
