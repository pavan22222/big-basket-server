package com.pavan.bigbasket.controller;


import com.pavan.bigbasket.domain.Item;
import com.pavan.bigbasket.service.ItemService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/items")
@AllArgsConstructor
public class ItemController {

    private final ItemService itemService;


    @GetMapping
    public ResponseEntity<List<Item>> getAllItems() {
        System.out.println("Hi");
        return ResponseEntity.ok(itemService.getAll());
    }

    @PostMapping
    public ResponseEntity<UUID> saveItem(@RequestBody Item item) {
        return new ResponseEntity<>(itemService.saveItem(item), HttpStatus.CREATED);
    }


}
