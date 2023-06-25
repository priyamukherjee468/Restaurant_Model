package com.example.Restaurant_Model.Factory;

import com.example.Restaurant_Model.Model.Restaurant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class BeanFactory {

    @Bean
    public Map<Integer, Restaurant> getRestaurantMap(){
       return new HashMap<>();
    }
}
