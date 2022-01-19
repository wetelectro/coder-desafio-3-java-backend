package coder.wetagustin.desafio3.products;

import java.util.UUID;

public class Product {

    private int id;
    private String title;
    private String thumbnail;
    private double price;

    static int currentId = 0;

    public Product(){
    }

    public Product(String title, double price, String thumbnail){
        this.title = title;
        this.price = price;
        this.thumbnail = thumbnail;
    }

    public void generateId(){
        this.id = currentId;
        currentId++;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public int getId() {
        return id;
    }
}
