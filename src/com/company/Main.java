package com.company;

import com.company.parent_class.Animal;

public class Main {


    public static void main(String[] args) {
       /* Animal animal = new Animal("Lion", true,true,2);
        animal.canMove =false;

        animal.properties(true);


        Tiger tiger = new Tiger("Bagh", true,true,2,4);
        tiger.properties(false);
        tiger.numberOfLeg=10;
*/

        Student student = new Student("Abdullah","123","DIU", 2.50f);
        student.name = " Modify";
        student.studentInfo();

        student.setCGPA(3.5f,"a123_123@gmail.com");

        student.studentInfo();






    }




}
