/**
 * Created by Junaid on 2/12/2025
 */
package com.mjk.spring6reactive.services;

import com.mjk.spring6reactive.model.CustomerDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CustomerService {
    Flux<CustomerDTO> listCustomers();

    Mono<CustomerDTO> getCustomerById(Integer customerId);

    Mono<CustomerDTO> saveNewCustomer(CustomerDTO customerDTO);

    Mono<CustomerDTO> updateCustomer(Integer customerId, CustomerDTO customerDTO);

    Mono<CustomerDTO> patchCustomer(Integer customerId, CustomerDTO customerDTO);

    Mono<Void> deleteCustomerById(Integer customerId);
}
