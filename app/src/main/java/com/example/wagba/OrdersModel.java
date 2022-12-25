package com.example.wagba;

public class OrdersModel {
    private String orderno;
    private String orderstatus;
    private int order_image;

    // Constructor
    public OrdersModel(String orderno, String orderstatus, int course_image) {
        this.orderno = orderno;
        this.orderstatus = orderstatus;
        this.order_image = order_image;
    }

    // Getter and Setter
    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String course_name) {
        this.orderno = course_name;
    }

    public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String course_rating) {
        this.orderstatus = course_rating;
    }

    public int getOrder_image() {
        return order_image;
    }

    public void setOrder_image(int course_image) {
        this.order_image = course_image;
    }

}
