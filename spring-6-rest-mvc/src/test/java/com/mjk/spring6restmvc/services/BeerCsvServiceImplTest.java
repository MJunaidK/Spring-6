/**
 * Created by Junaid on 1/29/2025
 */
package com.mjk.spring6restmvc.services;

import com.mjk.spring6restmvc.model.BeerCSVRecord;
import org.springframework.util.ResourceUtils;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BeerCsvServiceImplTest {

    BeerCsvService beerCsvService = new BeerCsvServiceImpl();

    @Test
    void convertCSV() throws FileNotFoundException {

        File file = ResourceUtils.getFile("classpath:csvdata/beers.csv");

        List<BeerCSVRecord> recs = beerCsvService.convertCSV(file);

        System.out.println(recs.size());

        assertThat(recs.size()).isGreaterThan(0);
    }
}
