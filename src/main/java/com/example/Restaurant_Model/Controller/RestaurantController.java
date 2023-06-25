package com.example.Restaurant_Model.Controller;

import com.example.Restaurant_Model.Model.Restaurant;
import com.example.Restaurant_Model.Service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;
    //get all restaurants
    @GetMapping("restaurants")
    public Map<Integer, Restaurant> getRestaurants()
    {

      return restaurantService.getRestaurants();
    }
    //add some restaurants
    @PostMapping("restaurants")
    public String addRestaurants(@RequestBody List<Restaurant>restaurants){
        return restaurantService.addRestaurants(restaurants);
    }
    @GetMapping("restaurants/Rid")
    public Restaurant getRestaurantsById(@PathVariable Integer Rid)
    {

        return restaurantService.getRestaurantsById(Rid);
    }
    @PutMapping("restaurants/{Rid}")
    public String updateRestaurants(@PathVariable Integer Rid,@RequestBody Restaurant restaurants){
        return restaurantService.updateRestaurants(Rid,restaurants);
    }
    @DeleteMapping("restaurants/{Rid}")
    public String removeUser(@PathVariable Integer Rid)
    {
        return restaurantService.removeUser(Rid);
    }

}
