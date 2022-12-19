package com.example.wagba;

public class DishModel {
    private String dishName;
    private String dishPrice;


    // Constructor
    public DishModel(String dishName, String dishPrice) {
        this.dishName = dishName;
        this.dishPrice = dishPrice;

    }

    public DishModel() {
    }

    // Getter and Setter

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }
    public void setDishPrice(String dishPrice) {
        this.dishPrice = dishPrice;
    }

    public String getDishName() {
        return dishName;
    }

    public String getDishPrice() {
        return dishPrice;
    }



}
