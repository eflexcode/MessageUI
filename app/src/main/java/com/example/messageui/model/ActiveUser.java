package com.example.messageui.model;

public class ActiveUser {

    int image;
    String userName;

    public ActiveUser(int image, String userName) {
        this.image = image;
        this.userName = userName;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
