package com.company;

public class Animal {
    String name ;
    boolean canMove;
    boolean canEat;
    int age;


    public Animal(String name, boolean canMove, boolean canEat, int age) {
        this.name = name;
        this.canMove = canMove;
        this.canEat = canEat;
        this.age = age;
    }

    public  void  properties(){

        print("Name "+ name);
        print("Can Move "+ canMove);
        print("Can Eat "+ canEat);
        print(age);


    }

    public void  print(String s) {
        System.out.println(s);
    }
    public void  print(int  age) {
        System.out.println(age);
    }

}
