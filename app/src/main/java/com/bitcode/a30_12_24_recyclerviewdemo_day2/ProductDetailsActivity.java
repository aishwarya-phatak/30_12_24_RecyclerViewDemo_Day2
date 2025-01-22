package com.bitcode.a30_12_24_recyclerviewdemo_day2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ProductDetailsActivity extends AppCompatActivity {

    TextView txtView1, txtView2;
    ImageView imgView1;
    String title;
    int prId, prImageId, prPrice;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_details_activity);
        initViews();
        extractDataAndBind();
    }

    private void initViews(){
        imgView1 = findViewById(R.id.imgView1);
        txtView1 = findViewById(R.id.txtView1);
        txtView2 = findViewById(R.id.txtView2);
    }

    private void extractDataAndBind(){
       Intent i = getIntent();
       Bundle b = i.getExtras();

       title = b.getString("product_title");
       prPrice = b.getInt("product_price");
       prImageId = b.getInt("product_image");
       prId = b.getInt("product_id");

       imgView1.setImageResource(R.drawable.ic_launcher_background);
       txtView1.setText(title);
       txtView2.setText(prPrice + " ");
    }
}
