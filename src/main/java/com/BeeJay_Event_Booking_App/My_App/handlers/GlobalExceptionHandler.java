package com.BeeJay_Event_Booking_App.My_App.handlers;

import com.BeeJay_Event_Booking_App.My_App.exceptions.EventExistException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

import static org.springframework.http.HttpStatus.BAD_REQUEST;


@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EventExistException.class)
    public ResponseEntity<?> eventExist(EventExistException existException){
        return ResponseEntity.status(BAD_REQUEST)
                .body(Map.of(
                        "error", existException.getMessage(),
                        "success", false
                ));
    }
}
