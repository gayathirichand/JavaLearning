package com.basics.quest5;

public class Mobile {

    String model;
    String brand;
    String color;
    int price;

    public Mobile(String model, String brand, String color, int price) {
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public void getDetails() {
        System.out.println("Model: " + model);
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println();
    }
}