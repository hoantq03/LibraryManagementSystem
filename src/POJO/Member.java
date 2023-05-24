/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POJO;

/**
 *
 * @author Ambivert
 */
public class Member {
    private String memberID;
    private String address;
    private int phone;
    private String email;
    private String registeredDate;
    
    //constructor
    
    public Member(){}

    public Member(String memberID, String address, int phone, String email, String registeredDate) {
        this.memberID = memberID;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.registeredDate = registeredDate;
    }
    
    //getter, setter

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(String registeredDate) {
        this.registeredDate = registeredDate;
    }
    
    
}
