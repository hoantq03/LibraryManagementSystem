/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POJO;

/**
 *
 * @author hoant
 */
public class Account {
    private String userName;
    private String password;
    private String name;
    private int secQuestion;
    private String answer;
    
    
    //constructor 

    public Account(String userName, String password, String name, int secQuestion, String answer) {
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.secQuestion = secQuestion;
        this.answer = answer;
    }
    
    public Account (){}
    
    
    //getter and setter 

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSecQuestion() {
        return secQuestion;
    }

    public void setSecQuestion(int secQuestion) {
        this.secQuestion = secQuestion;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
    
}
