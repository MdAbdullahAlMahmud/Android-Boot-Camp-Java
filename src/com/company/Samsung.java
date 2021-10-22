package com.company;

public class Samsung extends Operating{

   /* String version;
    String brand;
    String releaseDate;*/
    boolean isMultiTasking;
    public Samsung(String version,String brand , String releaseDate){
        // 12 , Samsung , ----
        super(version,brand,releaseDate);
    }

    public Samsung(String version,String brand , String releaseDate , boolean isMultiTasking){
        this(version,brand,releaseDate);
        this.isMultiTasking =isMultiTasking;
    }

    public  void variableRefreshRate(){
        System.out.println("Refresh Rate ");
    }
   /*

   s-----
   ----
   ----
   -----


    */









}
