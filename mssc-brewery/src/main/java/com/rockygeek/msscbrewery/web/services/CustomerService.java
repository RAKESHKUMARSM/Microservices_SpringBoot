package com.rockygeek.msscbrewery.web.services;

import com.rockygeek.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
