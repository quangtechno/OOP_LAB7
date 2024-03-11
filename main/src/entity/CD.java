package entity;

import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class CD implements Serializable{

    private String collection;
    private String type;
    private String title;
    private double Price;


    public CD(){
        
    }
    public CD(String collection, String type, String title, double Price) {
        this.collection = collection;
        this.type = type;
        this.title = title;
        this.Price = Price;
    }

    
    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    @Override
    public String toString() {
        return "CD{" + "collection=" + collection + ", type=" + type + ", title=" + title + ", Price=" + Price + '}';
    }

   

  
    
}
