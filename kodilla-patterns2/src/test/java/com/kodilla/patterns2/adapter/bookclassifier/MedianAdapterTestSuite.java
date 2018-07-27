package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Book book1 = new Book("Idi Amin","How to kill and eat people",1980, "sig1");
        Book book2 = new Book("Pol Pot","Pola smierci",1960, "sig2");
        Book book3 = new Book("Lenin","Nadiezda",1920, "sig3");
        Book book4 = new Book("Al Bagdadi","Daesz czyli isis",2000, "sig4");
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        //When
        int result = medianAdapter.publicationYearMedian(bookSet);
        //Then
        assertEquals(1980,result);
    }
}
