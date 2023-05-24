/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POJO;

/**
 *
 * @author Ambivert
 */
public class Return {
    private String StudentID;
    private String Name;
    private String BirthDay;
    private String Majors;
    private String Course;
    private String BookID;
    private String Title;
    private String Author;
    private double Price;
    private String Publisher;
    private int Page;
    
    public Return(){
        
    }

    public Return(String StudentID, String Name, String BirthDay, String Majors, String Course, String BookID, String Title, String Author, double Price, String Publisher, int Page) {
        this.StudentID = StudentID;
        this.Name = Name;
        this.BirthDay = BirthDay;
        this.Majors = Majors;
        this.Course = Course;
        this.BookID = BookID;
        this.Title = Title;
        this.Author = Author;
        this.Price = Price;
        this.Publisher = Publisher;
        this.Page = Page;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getBirthDay() {
        return BirthDay;
    }

    public void setBirthDay(String BirthDay) {
        this.BirthDay = BirthDay;
    }

    public String getMajors() {
        return Majors;
    }

    public void setMajors(String Majors) {
        this.Majors = Majors;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }

    public String getBookID() {
        return BookID;
    }

    public void setBookID(String BookID) {
        this.BookID = BookID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String Publisher) {
        this.Publisher = Publisher;
    }

    public int getPage() {
        return Page;
    }

    public void setPage(int Page) {
        this.Page = Page;
    }
    
    
}
