package com.BeeJay_Event_Booking_App.My_App.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

import static jakarta.persistence.EnumType.STRING;
import static jakarta.persistence.GenerationType.IDENTITY;
import static java.time.LocalDateTime.now;
import static lombok.AccessLevel.NONE;

@Getter
@Setter
@Entity
@Table(name = "organizer")
public class Organizer {
    @Id
    @GeneratedValue(strategy =IDENTITY)
    private Long id;
    private String username;
    private String password;
    @Setter(NONE)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime dateRegistered;

    @Setter(NONE)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime dateUpdated;
    @PrePersist
    private void setDateRegistered() {
        dateRegistered = now();
    }
    @PreUpdate
    private void setDateUpdated() {
        dateUpdated = now();
    }

}
