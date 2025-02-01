/**
 * Created by Junaid on 1/23/2025
 */
package com.mjk.spring6restmvc.repositories;

import com.mjk.spring6restmvc.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CustomerRepository extends JpaRepository<Customer, UUID> {
}
