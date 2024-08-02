package org.javacore;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Set;

public class Loops {

    public static void main(String[] args) {
       // loop - vong lap : for , while , do while

        Integer[] a = { 1, 2 ,3 ,4 ,5 };

        for(int i = 0 ; i < 5; i++ )
        {
            if(i == 2){
                continue;
            }
            System.out.println(i);
        }

        System.out.println("----------------------");
        //for each
        for(Integer item : a)
        {
            System.out.println(item);
        }

        System.out.println("------ while ---------");
        int iw= 0;
        while(iw == 1)
        {
            System.out.println("while - i: "+ iw );
            iw++;
        }

        System.out.println(" --- do while ----");
        int id= 0;
        do{
            System.out.println("do - id: "+id);
            ++id;
        }while(id == 1);

    }

}
