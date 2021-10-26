package com.company;

public class Tiger extends Animal{

    int numberOfLeg;

    public Tiger(String name, boolean canMove, boolean canEat, int age, int numberOfLeg) {
        super(name, canMove, canEat, age);
        this.numberOfLeg = numberOfLeg;
    }


    public void print(){
        System.out.println("Name "+ name);
        System.out.println("Name "+ canMove);
    }


    @Override
    public void properties() {
        super.properties();
        System.out.println("Number of Leg "+ numberOfLeg);
    }
}
