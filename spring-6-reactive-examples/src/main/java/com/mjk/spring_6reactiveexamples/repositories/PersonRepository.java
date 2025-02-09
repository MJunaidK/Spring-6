/**
 * Created by Junaid on 2/9/2025
 */
package com.mjk.spring_6reactiveexamples.repositories;

import com.mjk.spring_6reactiveexamples.domain.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonRepository {

    Mono<Person> getById(Integer id);
    Flux<Person> findAll();
}
