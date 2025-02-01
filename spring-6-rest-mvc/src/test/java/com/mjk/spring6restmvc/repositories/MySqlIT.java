/**
 * Created by Junaid on 1/27/2025
 */
package com.mjk.spring6restmvc.repositories;

import com.mjk.spring6restmvc.entities.Beer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.test.context.ActiveProfiles;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import javax.sql.DataSource;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@Testcontainers
@SpringBootTest
@ActiveProfiles("localmysql")
public class MySqlIT {

    @Container
    @ServiceConnection
    static MySQLContainer<?> mySQLContainer = new MySQLContainer<>("mysql:9");

    /*@DynamicPropertySource
    static void mySqlProperties(DynamicPropertyRegistry registry){
        registry.add("spring.datasource.username", mySQLContainer::getUsername);
        registry.add("spring.datasource.password", mySQLContainer::getPassword);
        registry.add("spring.datasource.url", mySQLContainer::getJdbcUrl);
    }*/

    @Autowired
    DataSource dataSource;

    @Autowired
    BeerRepository beerRepository;

    @Test
    void testListBeers() {
       List<Beer> beers = beerRepository.findAll();

       assertThat(beers.size()).isGreaterThan(0);
    }
}
