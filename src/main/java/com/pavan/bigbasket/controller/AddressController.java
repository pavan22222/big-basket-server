package com.pavan.bigbasket.controller;


import com.pavan.bigbasket.domain.Address;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("addresses")
public class AddressController {

    @GetMapping
    public ResponseEntity<List<Address>> getAll() {
        Address address1 = new Address(UUID.randomUUID(), "Hyd");
        Address address2 = new Address(UUID.randomUUID(),"Chennai");
        return ResponseEntity.ok(List.of(address1, address2));
    }

    @PostMapping
    public ResponseEntity<UUID> createAddress(@RequestBody Address address) {
        return new ResponseEntity(UUID.randomUUID(), HttpStatus.CREATED);
    }
}
