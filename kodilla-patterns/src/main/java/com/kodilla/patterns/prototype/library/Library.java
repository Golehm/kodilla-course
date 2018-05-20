package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Set;

public final class Library implements Cloneable{
    String name;
    Set<Book> books = new HashSet<>();

    public void setName(String name) {
        this.name = name;
    }

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        String s = "Library [" + name + "]\n";
        for(Book book : books) {
            s = s + book.toString() + "\n";
        }
        return s;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        Library clonedLibrary = (Library) super.clone();
        clonedLibrary.books = new HashSet<>();
        return clonedLibrary;
    }
    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = this.shallowCopy();
        Set<Book> clonedBooks = new HashSet<>();
        for(Book book : books) {
            clonedBooks.add(book);
        }
        clonedLibrary.books = clonedBooks;
        return clonedLibrary;
    }
}

