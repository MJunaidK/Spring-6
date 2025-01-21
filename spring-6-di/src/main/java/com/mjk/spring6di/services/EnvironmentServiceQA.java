/**
 * Created by Junaid on 1/15/2025
 */
package com.mjk.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service
public class EnvironmentServiceQA implements EnvironmentService{
    @Override
    public String getEnv() {
        return "qa";
    }
}
