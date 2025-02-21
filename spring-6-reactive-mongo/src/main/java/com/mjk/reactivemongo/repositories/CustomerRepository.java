package com.mjk.reactivemongo.repositories;

import com.mjk.reactivemongo.domain.Customer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * Created by jt, Spring Framework Guru.
 */
public interface CustomerRepository extends ReactiveMongoRepository<Customer, String> {
}
