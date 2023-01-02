package com.example.wagba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.wagba.databinding.ActivityDishesBinding;
import com.example.wagba.databinding.ActivityPaymentBinding;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class payment extends AppCompatActivity {
ActivityPaymentBinding bind;
    float calctotal = 0;
    Button btn;
    TextView stotal, tax, deliv, total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = ActivityPaymentBinding.inflate(getLayoutInflater());
        View view = bind.getRoot();
        setContentView(view);
        Intent i2 = getIntent();
        String tprice = i2.getExtras().getString("total price");
        btn = findViewById(R.id.checkbut);
        stotal = findViewById(R.id.subtotal);
        tax = findViewById(R.id.tax);
        deliv = findViewById(R.id.deliveryfees);
        total = findViewById(R.id.total);
        stotal.setText(tprice);
        String f2 = tax.getText().toString();
        String f3 = deliv.getText().toString();

        calctotal = Float.valueOf(tprice) + Float.valueOf(f2) + Float.valueOf(f3);

        total.setText(Float.toString(calctotal));
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference ref = FirebaseDatabase.getInstance().getReference("Orders")
                        .child(FirebaseAuth.getInstance().getCurrentUser().getUid());

                DatabaseReference dref = ref.push();
                String id = dref.getKey();
                dref.setValue(new OrdersModel( "order placed from " + basketholder.getinstance().getRestid(),"total price : " + calctotal,id));

                finish();
            }
        });

    }




}