package com.example.Tutorial2;

public class Product {
    private Long id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private double price;


    public Long setId(long id) {
        return this.id ;
    }

    public Object getId(){
        return id;
    }
}
