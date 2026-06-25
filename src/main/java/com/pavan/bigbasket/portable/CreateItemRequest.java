package com.pavan.bigbasket.portable;

import java.time.LocalDate;

public record CreateItemRequest(String name, double salary, LocalDate dom) {
}
