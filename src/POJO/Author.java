/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POJO;

/**
 *
 * @author Ambivert
 */
public class Author {
    private String bookID;
    private String authorName;
    private String email;
    
    //constructor

    public Author(){}
    
    public Author(String bookID, String authorName, String email) {
        this.bookID = bookID;
        this.authorName = authorName;
        this.email = email;
    }
    
    //getter, setter

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
