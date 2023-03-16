package com.example.petandvetclinic;

public class HelperClass {
    String  email, username, password,confirmPassword;

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConformPassword(String conformPassword) {
        this.confirmPassword = conformPassword;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public HelperClass(String email, String username, String password, String confirmPassword) {

        this.email = email;
        this.username = username;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public HelperClass() {
    }
}
