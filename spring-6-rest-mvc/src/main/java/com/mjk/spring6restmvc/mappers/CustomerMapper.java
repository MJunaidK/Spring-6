/**
 * Created by Junaid on 1/24/2025
 */
package com.mjk.spring6restmvc.mappers;

import com.mjk.spring6restmvc.entities.Customer;
import com.mjk.spring6restmvc.model.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDTO dto);

    CustomerDTO customerToCustomerDto(Customer customer);
}
