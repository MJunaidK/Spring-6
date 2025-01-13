/**
 * Created by Junaid on 1/12/2025
 */
package com.mjk.spring6webapp.repository;

import com.mjk.spring6webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
