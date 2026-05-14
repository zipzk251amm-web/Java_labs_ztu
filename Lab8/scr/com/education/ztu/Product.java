package com.education.ztu;

public class Product {
    private String name;
    private String brand;
    private double price;
    private int count;

    public Product(String name, String brand, double price, int count) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.count = count;
    }

    public String getName() { return name; }
    public String getBrand() { return brand; }
    public double getPrice() { return price; }
    public int getCount() { return count; }

    public void setName(String name) { this.name = name; }
    public void setBrand(String brand) { this.brand = brand; }
    public void setPrice(double price) { this.price = price; }
    public void setCount(int count) { this.count = count; }

    @Override
    public String toString() {
        return String.format("Product{name='%s', brand='%s', price=%.2f, count=%d}",
                name, brand, price, count);
    }
}