package com.masai.recyclerpracticebynr.models;

public class model1 {
    private int Image;
    private String text;

    public model1(int Image,String text){
        this.Image = Image;
        this.text =text;

    }
    public int getImage(){
        return Image;
    }
    public void setImage(int Image){
        this.Image =Image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
