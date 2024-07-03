package com.BeeJay_Event_Booking_App.My_App.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.modelmapper.Conditions.isNotNull;
import static org.modelmapper.convention.MatchingStrategies.STRICT;

@Configuration
public class MapperConfig {
    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration()
                .setMatchingStrategy(STRICT)
                .setPropertyCondition(isNotNull());
        return modelMapper;
    }
}
