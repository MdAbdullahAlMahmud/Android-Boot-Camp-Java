package com.company.developer;

import com.company.Employee;
import com.company.utiils.BaseSalary;

public  class Developer extends Employee {

    private String designation;

    public Developer(String name, int age, String address, String designation) {
        super(name, age, address);
        this.designation = designation;
    }

    @Override
    public int calculateSalary() {
        if (designation.equals(BaseSalary.DES_JUNIOR_ANDROID_DEVELOPER)){

            return BaseSalary.JUNIOR_ANDROID_DEVELOPER;
        }
         if (designation.equals(BaseSalary.DES_SENIOR_ANDROID_DEVELOPER)){



            return BaseSalary.SENIOR_ANDROID_DEVELOPER ;
        }
         if (designation.equals(BaseSalary.DES_PROJECT_MANAGER)){

            return BaseSalary.PROJECT_MANAGER;
        }

        return 0;
    }


    @Override
    public void employeeDetails() {
        super.employeeDetails();
        super.show("Salary : " + calculateSalary());
       // System.out.println();
    }
}
