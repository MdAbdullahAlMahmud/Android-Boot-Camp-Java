package com.company;

public class Operating {

    String version;
    String brand ;
    String releaseDate;

    public Operating(String version , String brand ,String releaseDate){
        this.version = version;
        this.releaseDate =releaseDate;
        this.brand = brand;
        System.out.println("Parent class's Cons. calling");
    }

    public void videoCall(){
        System.out.println("Video calling");
    }

    public void audioCall(){
        System.out.println("Audio calling");
    }

    public void notificationPanel(){
        System.out.println("Notification");
    }

}
