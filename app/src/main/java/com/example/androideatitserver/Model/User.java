package com.example.androideatitserver.Model;

public class User {
    private String Name;
    private String Password;
    private String Phone;
    private String Isstaff;

    public User() {
    }

    public User(String name, String password, String phone, String isstaff) {
        Name = name;
        Password = password;
        Phone = phone;
        Isstaff = isstaff;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getIsstaff() {
        return Isstaff;
    }

    public void setIsstaff(String isstaff) {
        Isstaff = isstaff;
    }
}
