package com.example.wagba;

import android.widget.ImageView;

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


//    public void loadPic(ImageView imageView, Context context){
//        storageReference = FirebaseStorage.getInstance().getReference().child("Dishes");
//        Glide.with(context)
//                .load(storageReference.child(this.id+".jpg"))
//                .into(imageView);
//    }

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