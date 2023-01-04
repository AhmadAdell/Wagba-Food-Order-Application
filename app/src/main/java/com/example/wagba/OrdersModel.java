package com.example.wagba;

public class OrdersModel {
    public String orderPrice;
    private String orderStatus;
    String id;


    // Constructor
    public OrdersModel(String orderPrice, String orderStatus, String id) {
        this.orderPrice = orderPrice;
        this.orderStatus = orderStatus;
        this.id = id;
    }
    public OrdersModel() {

    }
    // Getter and Setter


    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(String course_name) {
        this.orderPrice = course_name;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String course_rating) {
        this.orderStatus = course_rating;
    }



}
