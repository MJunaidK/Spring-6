package com.mjk.spring6restmvc.repositories;

import com.mjk.spring6restmvc.entities.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class CustomRepositoryTest {
    
    @Autowired
    CustomerRepository customRepository;

    @Test
    void testSaveCustomer() {
        Customer customer = customRepository.save(Customer.builder()
                        .name("New Name")
                .build());

        assertThat(customer.getId()).isNotNull();
    }
}