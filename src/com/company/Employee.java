package com.company;

public abstract class Employee {

    private String name;
    private int age;
    private String address;

    public abstract int calculateSalary();

    public Employee(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public void employeeDetails(){
        show("Name " + name);
        show("Age " + age);
        show("Address " + address);
    }

    public void show(String msg){
        System.out.println(msg);
    }


}
