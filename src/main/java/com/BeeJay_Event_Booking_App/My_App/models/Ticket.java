package com.BeeJay_Event_Booking_App.My_App.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    @Enumerated(EnumType.STRING)
//    private TicketCategory category;
    private BigDecimal price;
    private LocalDate eventDate;
    private String eventName;
    private String eventDescription;
//    @Enumerated(EnumType.STRING)
//    private TicketStatus ticketStatus;
//    @ManyToOne
//    private Customer customer;
    @Column(unique = true)
    private Long reservationId;
}
