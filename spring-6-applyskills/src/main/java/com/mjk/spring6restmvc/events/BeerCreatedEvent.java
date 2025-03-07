package com.mjk.spring6restmvc.events;

import com.mjk.spring6restmvc.entities.Beer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.Authentication;

/**
 * Created by jt, Spring Framework Guru.
 */
@Getter
@Setter
@AllArgsConstructor
@Builder
public class BeerCreatedEvent implements BeerEvent {

    private Beer beer;

    private Authentication authentication;
}
