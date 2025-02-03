/**
 * Created by Junaid on 2/2/2025
 */
package com.mjk.spring6restmvc.repositories;

import com.mjk.spring6restmvc.entities.BeerOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BeerOrderRepository extends JpaRepository<BeerOrder, UUID> {
}
