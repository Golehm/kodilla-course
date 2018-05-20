package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        //Given

        Book book1 = new Book("Solaris","S. Lem",LocalDate.of(2017, Month.JANUARY, 22));
        Book book2 = new Book("Witcher","A. Sapkowski",LocalDate.of(2017, Month.JULY, 5));
        Book book3 = new Book("Valis","P. K. Dick",LocalDate.of(2017, Month.DECEMBER, 21));
        Book book4 = new Book("Greed","P.J Berch",LocalDate.of(1984, Month.JUNE, 17));
        //When
        Library library = new Library("Library of Congress");
        library.books.add(book1);
        library.books.add(book2);
        library.books.add(book3);
        library.books.add(book4);
        Library libraryShallowCopy = null;
        try{
            libraryShallowCopy = library.shallowCopy();
            libraryShallowCopy.setName("Shallow Copy Library");
        }
        catch (Exception e){

        }
        Library libraryDeepCopy = null;
        try{
        libraryDeepCopy = library.deepCopy();
        libraryDeepCopy.setName("Deep Copy Library");
        }
        catch (Exception e){

        }
        Book book5 = new Book("Fake Book", "Fake Author", LocalDate.now());
        libraryShallowCopy.books.add(book5);
        libraryDeepCopy.books.add(book5);
        //Then
        System.out.println(library);
        System.out.println(libraryShallowCopy);
        System.out.println(libraryDeepCopy);
        Assert.assertEquals(4, library.books.size());
        Assert.assertEquals(1, libraryShallowCopy.books.size());
        Assert.assertEquals(5, libraryDeepCopy.books.size());
    }
}
