/**
 * Created by Junaid on 1/14/2025
 */
package com.mjk.spring6di.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingBean")
public class GreetingServiceSetterInjection implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hey I'm Setting a Greeting!!";
    }
}
