/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.ws.mobileappws.ui.model.request;

/**
 *
 * @author Arun
 */
public class UserDetailsRequestModel {
    
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public UserDetailsRequestModel() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserDetailsRequestModel{" + "firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password=" + password + '}';
    }
    
    
    
}
