/**
 * Created by Junaid on 1/12/2025
 */
package com.mjk.spring6webapp.repository;

import com.mjk.spring6webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
