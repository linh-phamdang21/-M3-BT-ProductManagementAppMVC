package model;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class Product {
    private int id;
    private String name;
    private String brand;
    private int price;
    private String status;

    public Product(){

    }

    public Product(int id, String name, String brand, int price, String status){
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
