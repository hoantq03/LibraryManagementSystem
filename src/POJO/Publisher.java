/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POJO;

/**
 *
 * @author Ambivert
 */
public class Publisher {
    private String publisherID;
    private String name;
    private String address;
    private String email;
    
    //constructor
    
    public Publisher(){}

    public Publisher(String publisherID, String name, String address, String email) {
        this.publisherID = publisherID;
        this.name = name;
        this.address = address;
        this.email = email;
    }
    
    //getter, setter

    public String getPublisherID() {
        return publisherID;
    }

    public void setPublisherID(String publisherID) {
        this.publisherID = publisherID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
