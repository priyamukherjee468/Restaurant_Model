package com.example.Restaurant_Model.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {
    private int restaurantId;
    private String restaurantName;
    private String restaurantAddress;
    private int restaurantNumber;

    private String restaurantSpeciality;
    private int restaurantStuff;


}
