/**
 * Created by Junaid on 1/23/2025
 */
package com.mjk.spring6restmvc.repositories;

import com.mjk.spring6restmvc.entities.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BeerRepository extends JpaRepository<Beer, UUID> {
}
