package com.example.wagba;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class Pageadapter extends FragmentStatePagerAdapter {
    int nNumOfTabs;
    public Pageadapter(FragmentManager fragmentManager, int nNumOfTabs){
        super(fragmentManager);
        this.nNumOfTabs=nNumOfTabs;
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                Restfrag restfrag = new Restfrag();



                return restfrag;
            case 1:
                orders orderfrag =new orders();


                return orderfrag;
            case 2:
                basket basketfrag = new basket();


                return basketfrag;

            default:
                return null;

        }

    }

    @Override
    public int getCount() {
        return nNumOfTabs;
    }
}
