package com.company;

public class Main {

    public static void main(String[] args) {

        Mobile mobile = new Mobile("Samsung" , "12","31");
       // mobile.showMessage();

        Samsung samsung = new Samsung("12", "Samsung" , "22/10/2021");
        samsung.audioCall();
        samsung.videoCall();
        samsung.variableRefreshRate();

        Vivo vivo = new Vivo("11" , "Vevo", " 10/10/2021");
        vivo.audioCall();
        vivo.videoCall();
        vivo.notificationPanel();





    }

}
