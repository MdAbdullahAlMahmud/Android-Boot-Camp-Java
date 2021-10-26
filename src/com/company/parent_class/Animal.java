package com.company.parent_class;

public class Animal {
    public String name ;
    public boolean canMove;
    public boolean canEat;
    public int age;


    protected int numberOfEye;


    public Animal(String name, boolean canMove, boolean canEat, int age) {
        this.name = name;
        this.canMove = canMove;
        this.canEat = canEat;
        this.age = age;
    }

    public  void  properties(boolean isApproved){

        if (isApproved){
            print("Name "+ name);
            print("Can Move "+ canMove);
            print("Can Eat "+ canEat);
            print(age);
        }else {
            print("Not Approved");
        }



    }

    public void  print(String s) {
        System.out.println(s);
    }
    public void  print(int  age) {
        System.out.println(age);
    }

    public void  print(int  age, String s) {
            System.out.println(age);
            System.out.println(s);
        }

}
