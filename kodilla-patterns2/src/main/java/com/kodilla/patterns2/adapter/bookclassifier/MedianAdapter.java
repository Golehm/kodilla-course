package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;

import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    public MedianAdapter() {
        super();
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
        return 0;
    }
}
