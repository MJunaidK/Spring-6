/**
 * Created by Junaid on 1/12/2025
 */
package com.mjk.spring6webapp.services;

import com.mjk.spring6webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();

}
