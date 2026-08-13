/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitlearnproject;

/**
 *
 * @author farid
 */
public class Student {
    private String name;
    private String email;
    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email==null || email.isEmpty())
            throw new IllegalArgumentException("email cannot is empty");
        
        if (!email.contains("@"))
            throw new IllegalArgumentException("Invalid email");
        
        this.email = email;
    }
    
    
}