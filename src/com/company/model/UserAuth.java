package com.company.model;

public interface UserAuth {


     void userRegistration(Person person);

     void login(Person person, UserLoginListener listener);


     interface UserLoginListener{

          void  onSuccess();
          void onFailure();

     }




}
