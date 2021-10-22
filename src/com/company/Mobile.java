package com.company;

public class Mobile {

    String brand_Name;
    String OS;
    String sdk;

    public Mobile(String brandName){
        brand_Name = brandName;
    }

    public Mobile(String brandName, String OS){
        System.out.println("Con. with param. 2 calling ");
        brand_Name = brandName;
        this.OS = OS;
    }

    public Mobile(String brandName, String OS ,String sdk){
        this(brandName,OS);
        this.sdk = sdk;
        // data = 1000;
        // minutes =10
        // balance =100
        System.out.println("Con. with param. 3 calling ");
    }



    public void showMessage(){
        System.out.println("Mobile Brand " +brand_Name   + "\n Operating System "+ OS
        +"\n SDK "+ sdk
        );
    }
}
