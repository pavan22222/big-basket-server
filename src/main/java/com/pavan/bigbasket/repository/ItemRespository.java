package com.pavan.bigbasket.repository;

import com.pavan.bigbasket.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ItemRespository extends JpaRepository<Item, UUID> {
}
