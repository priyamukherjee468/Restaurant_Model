package com.example.Restaurant_Model.Repository;

import com.example.Restaurant_Model.Model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class RestaurantRepo {
    @Autowired
    Map<Integer, Restaurant> restaurants;



    public Map<Integer, Restaurant> getRestaurantList() {
        return restaurants;
    }
}
