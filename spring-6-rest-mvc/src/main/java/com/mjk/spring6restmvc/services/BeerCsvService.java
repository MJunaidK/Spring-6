/**
 * Created by Junaid on 1/29/2025
 */
package com.mjk.spring6restmvc.services;

import com.mjk.spring6restmvc.model.BeerCSVRecord;

import java.io.File;
import java.util.List;

public interface BeerCsvService {
        List<BeerCSVRecord> convertCSV(File csvFile);
 }
