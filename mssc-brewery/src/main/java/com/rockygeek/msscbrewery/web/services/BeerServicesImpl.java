package com.rockygeek.msscbrewery.web.services;

import com.rockygeek.msscbrewery.web.model.BeerDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServicesImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }

    public BeerDto saveNewBeer(BeerDto beerDto) {
        return  BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }
}
