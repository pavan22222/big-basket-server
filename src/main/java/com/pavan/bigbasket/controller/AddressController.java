package com.pavan.bigbasket.controller;


import com.pavan.bigbasket.domain.Address;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("addresses")
public class AddressController {

    @GetMapping
    public ResponseEntity<List<Address>> getAll() {
        Address address1 = Address.builder().id(UUID.randomUUID()).city("Hyd").build();
        Address address2 = Address.builder().id(UUID.randomUUID()).city("Chennai").build();
        return ResponseEntity.ok(List.of(address1, address2));
    }
}
