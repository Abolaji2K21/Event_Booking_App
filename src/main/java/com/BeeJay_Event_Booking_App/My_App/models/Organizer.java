package com.BeeJay_Event_Booking_App.My_App.models;

import com.BeeJay_Event_Booking_App.My_App.constant.Role;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

import static jakarta.persistence.EnumType.STRING;
import static jakarta.persistence.GenerationType.IDENTITY;
import static lombok.AccessLevel.NONE;

@Getter
@Setter
public class Organizer {

    @Id
    @GeneratedValue(strategy =IDENTITY)
    private Long id;
    private String username;
    private String password;
    @Enumerated(value = STRING)
    private Role role;

    @Setter(NONE)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime dateRegistered;
}
