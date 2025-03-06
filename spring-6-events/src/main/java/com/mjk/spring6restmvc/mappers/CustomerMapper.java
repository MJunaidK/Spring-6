package com.mjk.spring6restmvc.mappers;

import com.mjk.spring6restmvc.entities.Customer;
import com.mjk.spring6restmvc.model.CustomerDTO;
import org.mapstruct.Mapper;

/**
 * Created by jt, Spring Framework Guru.
 */
@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDTO dto);

    CustomerDTO customerToCustomerDto(Customer customer);

}
