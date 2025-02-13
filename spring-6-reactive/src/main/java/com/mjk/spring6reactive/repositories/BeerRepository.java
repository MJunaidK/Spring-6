/**
 * Created by Junaid on 2/10/2025
 */
package com.mjk.spring6reactive.repositories;

import com.mjk.spring6reactive.domain.Beer;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface BeerRepository extends ReactiveCrudRepository<Beer, Integer> {
}
