/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POJO;

/**
 *
 * @author Ambivert
 */
public class Student {
    private String StudentID;
    private String Name;
    private String BirthDay;
    private String Majors;
    private String Course;
    
    public Student(){
        
    }

    public Student(String StudentID, String Name, String BirthDay, String Majors, String Course) {
        this.StudentID = StudentID;
        this.Name = Name;
        this.BirthDay = BirthDay;
        this.Majors = Majors;
        this.Course = Course;
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
    
    
}
