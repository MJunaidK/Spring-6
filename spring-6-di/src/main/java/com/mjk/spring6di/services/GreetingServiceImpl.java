/**
 * Created by Junaid on 1/14/2025
 */
package com.mjk.spring6di.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Everyone from Base Service!!!";
    }
}
