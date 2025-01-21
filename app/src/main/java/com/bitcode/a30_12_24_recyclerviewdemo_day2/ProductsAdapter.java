package com.bitcode.a30_12_24_recyclerviewdemo_day2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ProductViewHolder> {

    ImageView productImageView;
    TextView productTitleTxtView, productPriceTxtView;
    ArrayList<Product> products;

    public ProductsAdapter(ArrayList<Product> products1){
        this.products = products1;
    }

    class ProductViewHolder extends RecyclerView.ViewHolder{

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            productImageView = itemView.findViewById(R.id.productImageView);
            productTitleTxtView = itemView.findViewById(R.id.productTitleTxtView);
            productPriceTxtView = itemView.findViewById(R.id.productPriceTxtView);
        }
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View productView = layoutInflater.inflate(R.layout.product_view_holder,null);

        return new ProductViewHolder(productView);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Product product = products.get(position);       //extract eachProduct from array of product objects

        //get views from holder bu using findViewById
        productImageView = holder.itemView.findViewById(R.id.productImageView);
        productTitleTxtView = holder.itemView.findViewById(R.id.productTitleTxtView);
        productPriceTxtView = holder.itemView.findViewById(R.id.productPriceTxtView);

        //bind eachProduct data with the corresponding views
        productTitleTxtView.setText(product.productTitle);
        productPriceTxtView.setText(product.productPrice + " ");
        productImageView.setImageResource(R.drawable.ic_launcher_background);
    }

    @Override
    public int getItemCount() {
        return products.size();
    }
}
