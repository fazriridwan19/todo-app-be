package com.ursklap.todoserver.mapper;

import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperUtil {
  @Bean
  public org.modelmapper.ModelMapper modelMapper() {
    org.modelmapper.ModelMapper modelMapper = new org.modelmapper.ModelMapper();

    modelMapper
            .getConfiguration()
            .setMatchingStrategy(MatchingStrategies.STRICT);

    return modelMapper;
  }
}
