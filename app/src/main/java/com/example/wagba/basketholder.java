package com.example.wagba;

import java.util.ArrayList;

public class basketholder {

    private   ArrayList<DishModel> ItemsModels;
    private static basketholder uinstance;

    public ArrayList<DishModel> getItemsModels() {
        return ItemsModels;
    }
    public void additem (DishModel x){

        ItemsModels.add(x);

    }

    private basketholder() {
        ItemsModels = new ArrayList<>();

    }
    public static  basketholder getinstance ()
    {
        if(uinstance==null)
        {
            uinstance = new basketholder();
        }
            return uinstance;

    }
}
