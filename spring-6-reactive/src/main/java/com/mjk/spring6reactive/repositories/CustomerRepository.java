/**
 * Created by Junaid on 2/12/2025
 */
package com.mjk.spring6reactive.repositories;

import com.mjk.spring6reactive.domain.Customer;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface CustomerRepository extends ReactiveCrudRepository<Customer, Integer> {
}
