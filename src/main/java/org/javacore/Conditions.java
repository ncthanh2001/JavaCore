package org.javacore;

public class Conditions {

    public static void main(String[] args) {
        // if else , switch case,

        int i = 1;

        if(i == 1)
        {
            System.out.println( "iIf = 0");
        }

        if(i ==1 )
        {
            System.out.println("iE == 1");
        }
        else {
            System.out.println("i != 0");
        }

        int iE= 5;

        if(iE == 5)
        {
            System.out.println("iE5: "+iE);
        }
        else if (iE == 6) {
            System.out.println("iE6: "+iE);
        }

        else {
            System.out.println("iE: "+iE);
        }

        // switch
        int day =3;

        switch (day)
        {
            case 1:
                System.out.println("case1");

            case 2:
                System.out.println("case2");
                break;
            case 3:
                System.out.println("case3");

            case 4:
                System.out.println("case4");
                break;
            default:
                System.out.println("default");
        }






    }

}
