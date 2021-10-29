package com.company.model;

public class User implements UserAuth.UserLoginListener{

    @Override
    public void onSuccess() {
        // -------------- Valid

        System.out.println("Login Success");
    }

    @Override
    public void onFailure() {
        // -------------- InValid
        System.out.println("Login failed");
    }
}
