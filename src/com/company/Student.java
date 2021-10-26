package com.company;

public class Student {


    private String gmail = "a123_123@gmail.com";

    public String name;
    private String id;
    private String versity;
    private float cgpa;


   /* public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }*/



    public Student(String name, String id, String versity, float cgpa) {
        this.name = name;
        this.id = id;
        this.versity = versity;
        this.cgpa = cgpa;
    }

   public void  studentInfo(){
        System.out.println("Name "+ name);
        System.out.println("ID "+ id);
        System.out.println("Versity "+ versity);
        System.out.println("CGPA  "+ cgpa);
   }


   public float getCGPA(){
         return cgpa;
   }

   // getter and setter

    public void setCGPA(float usercgpa,String userGmail){

        if (userGmail.equals(gmail)){
            this.cgpa = usercgpa; // usercgpa
        }else {
            System.out.println("You don't have permission");
        }

    }

}
