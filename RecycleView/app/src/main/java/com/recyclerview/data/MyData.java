package com.recyclerview.data;

public class MyData {
    private String name;
    private  String address;
    private int image;

    public MyData(String name,String address,int image){
        this.name=name;
        this.address=address;
        this.image=image;
    }
    public String getName(){
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getImage() {
        return image;
    }
}
