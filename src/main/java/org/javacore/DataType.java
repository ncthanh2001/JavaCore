package org.javacore;
// tinh dong goi

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class DataType {


    /**
     * viet doc
     * {@link org.javacore.Main}
     */

    // comment 1 dong

    /*
        comment nhieu dong
     */
    public static void main(String[] args) {

        Date ngaysinh;
        Date ngay_sinh; // kieu dat snake
        Date ngaySinh; // kieu dat bien CamelCase con lac da

//        int a = 0;
//        int b =0 ;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhap bien a: ");
//        a = sc.nextInt();
//        System.out.print("Nhap bien b: ");
//        b = sc.nextInt();
//        System.out.printf("bien a: %d va bien b: %d  va bien c: %d",a,b);

//        String chuoiA ;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("nhap chuoi A: ");
//        chuoiA = sc.nextLine();
//        System.out.printf("Chuoi A: %s",chuoiA);

        // a = 10 b=20 -> bien a: 10 bien B 20

        /* kieu du lieu nguyen thuy
        boolean, char, short ,int , long ,byte,float , double
         */

        int aN = 10;


        /*  kieu du lieu wrapper ( kieu boc )

        Boolean, Short, Integer, Long Byte Float Double, String
        + cung cap  cac ham co san cua kieu du lieu wrapper
         */

        Integer aW = 10;
        String aT = "Nguyen Chi Thanh";

        float aType = 10.5f;
        double dType = 10.5;
        long lType = 100l;


        // kieu tham chieu
        // tham chieu toi mot doi tuong
        Students sv1 = new Students();


        // ep kieu : ep kieu tuong va ep kieu ngam dinh
        int a = 0;
        String sType = String.valueOf(a);

        char cType = (char) a; // ep kieu tuong minh cua kieu nguyen thuy

        // ep kieu tuong minh cua wrapper
        Integer aTWW = 20;

        String castS = String.valueOf(aTWW);

        String c = "10";

        Integer d = Integer.valueOf(c);

        System.out.println("castS: " + castS + " - bien d: " + d);

        //

    }


}
