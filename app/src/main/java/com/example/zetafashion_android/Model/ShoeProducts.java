package com.example.zetafashion_android.Model;

public class ShoeProducts {
    String ProductName,ProductPrice,ProductCategory;
    String ProductImageUrl;

    public ShoeProducts() {
    }

    public ShoeProducts(String productName, String productPrice, String productCategory, String productImageUrl) {
        ProductName = productName;
        ProductPrice = productPrice;
        ProductCategory = productCategory;
        ProductImageUrl = productImageUrl;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(String productPrice) {
        ProductPrice = productPrice;
    }

    public String getProductCategory() {
        return ProductCategory;
    }

    public void setProductCategory(String productCategory) {
        ProductCategory = productCategory;
    }

    public String getProductImageUrl() {
        return ProductImageUrl;
    }

    public void setProductImageUrl(String productImageUrl) {
        ProductImageUrl = productImageUrl;
    }
}