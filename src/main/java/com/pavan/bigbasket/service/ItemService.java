package com.pavan.bigbasket.service;


import com.pavan.bigbasket.domain.Item;
import com.pavan.bigbasket.repository.ItemRespository;
import io.swagger.v3.oas.annotations.servers.Server;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ItemService {

    private final ItemRespository itemRespository;

    public List<Item> getAll() {
        return itemRespository.findAll();
    }

    @Transactional
    public UUID saveItem(Item item) {
        return itemRespository.save(item).getId();
    }


}
