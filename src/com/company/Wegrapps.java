package com.company;

import com.company.developer.Developer;
import com.company.model.Calculator;
import com.company.model.Person;
import com.company.model.UserAuth;
import com.company.utiils.BaseSalary;

public class Wegrapps {


    public static void main(String[] args) {

        Developer dev = new Developer("Abdullah",23, "Dhaka", BaseSalary.DES_SENIOR_ANDROID_DEVELOPER);
        dev.employeeDetails();


        Calculator calculator = new Calculator();
        System.out.println("Ans "+ calculator.multiplication(5,10));


        Person person = new Person("a" , "1234", " Abdullah");


        person.login(person, new UserAuth.UserLoginListener() {
            @Override
            public void onSuccess() {
                System.out.println("You are valid User");
            }

            @Override
            public void onFailure() {
                System.out.println("You are Invalid User");
            }
        });






    }
}
