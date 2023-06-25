package com.example.Restaurant_Model.Service;

import com.example.Restaurant_Model.Model.Restaurant;
import com.example.Restaurant_Model.Repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;


@Service
public class RestaurantService {

    @Autowired
    RestaurantRepo restaurantRepo;

    public String updateRestaurants(Integer Rid,Restaurant restaurants) {
        Map<Integer, Restaurant> restaurantList=restaurantRepo.getRestaurantList();
        for(Map.Entry<Integer,Restaurant> mapElement : restaurantList.entrySet()){
            if(mapElement.getValue().getRestaurantId()==Rid){
                mapElement.getValue().setRestaurantName(restaurants.getRestaurantName());
                mapElement.getValue().setRestaurantAddress(restaurants.getRestaurantAddress());
                mapElement.getValue().setRestaurantSpeciality(restaurants.getRestaurantSpeciality());


            }
        }
        return null;
    }


    public Map<Integer, Restaurant> getRestaurants() {
        return restaurantRepo.getRestaurantList();
    }

    public String addRestaurants(List<Restaurant> restaurants) {
        Map<Integer, Restaurant> restaurantList= getRestaurants();
        for(Restaurant restaurant:restaurants){
           restaurantList.put(restaurant.getRestaurantId(),restaurant);
        }
        return "Restaurants are added.";
    }

    public Restaurant getRestaurantsById(Integer Rid) {
        Map<Integer, Restaurant> restaurantList=restaurantRepo.getRestaurantList();
        for(Map.Entry<Integer,Restaurant> mapElement : restaurantList.entrySet()){
            if(mapElement.getValue().getRestaurantId()==Rid){
                return mapElement.getValue();

            }
        }
return null;
    }

    public String removeUser(Integer Rid) {
        Map<Integer, Restaurant> restaurantList = getRestaurants();
        Restaurant restaurant = restaurantList.get(Rid);
        if(restaurant!=null)
        {
            restaurantList.remove(Rid);
            return Rid + " removed!!!";
        }
        else {
            return Rid + " not found!!!";
        }
    }

}


