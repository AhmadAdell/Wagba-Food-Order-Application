package com.example.wagba;

public class RestaurantModel {
    private String name;
    private String status;
    private String ID;

    public RestaurantModel(String name, String status, String ID) {
        this.name = name;
        this.status = status;
        this.ID = ID;
    }

    public RestaurantModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }
}