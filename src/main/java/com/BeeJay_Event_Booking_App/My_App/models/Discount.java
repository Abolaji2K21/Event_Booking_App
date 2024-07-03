package com.BeeJay_Event_Booking_App.My_App.models;


import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Table(name = "discount")
public class Discount {

    private BigDecimal price;
    private Integer quantity;
}
