package com.pavan.bigbasket.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "Items")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Item {

    @Id
    private UUID id;

    private String name;

    private double price;

    private LocalDate dom;
}
