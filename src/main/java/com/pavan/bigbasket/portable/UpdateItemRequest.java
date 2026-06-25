package com.pavan.bigbasket.portable;

import java.time.LocalDate;

public record UpdateItemRequest(double price, LocalDate dom) {
}
