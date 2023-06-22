package com.example.ass2;

public class item {
    int image;
    String choice;

    public item(int image, String choice) {
        this.image = image;
        this.choice = choice;
    }

    public int getImage() {
        return image;
    }

    public String getChoice() {
        return choice;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }
}
