package com.price.model;

public class Price {
	
    private int productId;
    private double salePrice;
    private double listPrice;

    public Price() {
    }

    public Price(int productId, double salePrice, double listPrice) {
        this.productId = productId;
        this.listPrice = listPrice;
        this.salePrice = salePrice;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
    
    public double getSalePrice() {
        return salePrice;
    }

    public void setProductId(double salePrice) {
        this.salePrice = salePrice;
    }
    
    public double getListPrice() {
        return listPrice;
    }

    public void setListPrice(double listPrice) {
        this.listPrice = listPrice;
    }

}
