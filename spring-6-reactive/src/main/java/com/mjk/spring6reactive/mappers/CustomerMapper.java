/**
 * Created by Junaid on 2/12/2025
 */
package com.mjk.spring6reactive.mappers;

import com.mjk.spring6reactive.domain.Customer;
import com.mjk.spring6reactive.model.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    Customer customerDtoToCustomer(CustomerDTO dto);

    CustomerDTO customerToCustomerDto(Customer customer);
}