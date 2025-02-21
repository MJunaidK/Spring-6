package com.mjk.reactivemongo.mappers;

import com.mjk.reactivemongo.domain.Customer;
import com.mjk.reactivemongo.model.CustomerDTO;
import org.mapstruct.Mapper;

/**
 * Created by jt, Spring Framework Guru.
 */
@Mapper
public interface CustomerMapper {

    CustomerDTO customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDTO customerDTO);
}
