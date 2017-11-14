package com.knoldus;

/**
 * Created by knoldus on 13/11/17.
 */
public class Math {
    DataProvider dataProvider = new DataProvider();
   
    public int add(){
        int x = dataProvider.retieveData();
        int local = 5;
        
        return x+local;
    }
    private int multi(){
        int x=dataProvider.retieveData();
        int local=5;
        System.out.println(local);
        return x*local;
    }
}
