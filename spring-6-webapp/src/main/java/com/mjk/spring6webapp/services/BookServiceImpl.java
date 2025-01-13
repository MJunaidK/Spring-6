/**
 * Created by Junaid on 1/12/2025
 */
package com.mjk.spring6webapp.services;

import com.mjk.spring6webapp.domain.Book;
import com.mjk.spring6webapp.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
