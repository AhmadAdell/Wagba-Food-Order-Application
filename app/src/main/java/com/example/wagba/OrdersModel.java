package com.example.wagba;

public class OrdersModel {
    private String orderPrice;
    private String orderStatus;


    // Constructor
    public OrdersModel(String orderPrice, String orderStatus) {
        this.orderPrice = orderPrice;
        this.orderStatus = orderStatus;
    }
    public OrdersModel() {

    }
    // Getter and Setter
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
