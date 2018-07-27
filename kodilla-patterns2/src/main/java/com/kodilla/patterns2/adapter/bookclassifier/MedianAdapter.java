package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.Statistics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    public MedianAdapter() {
        super(new Statistics());
    }

    @Override
    public int averagePublicationYear(Map<BookSignature, com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book> books) {
        return super.averagePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book> books) {
        return super.medianPublicationYear(books);
    }

    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book> booksMap = new
                HashMap<BookSignature, com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book>();
        for(Book book : bookSet) {
            BookSignature bookSignature = new BookSignature(book.getSignature());
            com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book bookB = new
                    com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book(book.getAuthor(),
                    book.getTitle(), book.getPublicationYear());
            booksMap.put(bookSignature, bookB);
        }

        return medianPublicationYear(booksMap);
    }
}
