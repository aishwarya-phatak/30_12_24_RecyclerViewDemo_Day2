package com.bitcode.a30_12_24_recyclerviewdemo_day2;

import androidx.annotation.NonNull;

public class Product {
    int productId;
    String productTitle;
    int productPrice;
    int imageId;

    public Product(int productId, String productTitle, int productPrice, int imageId) {
        this.productId = productId;
        this.productTitle = productTitle;
        this.productPrice = productPrice;
        this.imageId = imageId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public int getImageId() {
        return imageId;
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }

}
