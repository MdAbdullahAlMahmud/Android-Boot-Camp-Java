package com.company;


public class Main {

    public static void main(String[] args) {
       /* int a ;
        a = 15;
        float b;
        double d;
        String word = "djfksldjfksdjf";
        boolean isOdd = true;
        boolean isEven = false;
        long l ;
        char ch = 'a';
        System.out.println(a);
        int m = 10 , n=10 ;
        if (m>n){
            System.out.println("M is grater that N");
        }else if(m==n){
            System.out.println("M & N are same");
        }
        else {
            System.out.println("N is grater that M");
        }

        switch (m){
            case 1:
                System.out.println("M = 1");
            case 2 :
                System.out.println("M = 1");
            default:
                System.out.println("M is out of range");
        }*/
       /* Scanner sc = new Scanner(System.in);



        //float val = scanners.nextFloat();
        String course = "Android Bootcamp ";
       // System.out.println(course + val);

        int m = 45;

        int a = 10 ;
        float val = (float) a;
         //System.out.println("Value is " + val);

        int y = 45;
        String ys = y + " ";
        Integer yt = 45;
         System.out.println("Value is ");*/

        String cpc = "Android Bootcamp 2.0";
        //System.out.println(cpc);

        //5
        /*
        1*1 = 1
        1*2 = 2
        .......
        1*10 = 10

        ----------------
        2*1 = 2
        2*2 = 4
        ----------------
        5*1 = 5
        5*2 = 10

         */

        for (int a :oddNumberInRange(7)
             ) {

            System.out.println(a);
        }

    }

    private static int[] oddNumberInRange(int range){
        int arr[] = {1,3,5,7,9,11};
        return arr;
    }

}
