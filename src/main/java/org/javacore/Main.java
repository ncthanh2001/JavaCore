package org.javacore;

import java.util.Scanner;

public class Main {

    /*
    * Khi chạy chương trình java thì jvm sẽ tim tới hàm main đầu tiên
    * và trong 1 chương trình chỉ có 1 hàm main duy nhất
    * public -> bât cứ thằng nào cũng có thẻ gọi được hàm main này
    * static -> nó là tĩnh biến tĩnh -> nó sẽ được tạo khi mà chạy chương trình mà không phải tạo hàm tạo cho
    *   1 đối tượng cụ thể
    *   String [] args command line arguments
     */

    public static void main(String[] args)
    {


        Dog dog1 = new Dog();

        dog1.makeSoud();
        dog1.sleep();
        dog1.printName();
        dog1.move();
        String line = dog1.eat("an gi cung duoc");
        System.out.println(line);



        Dog dog2 = new Dog("Lu");
        dog2.printName();

        String[] arrString =  {"Thanh","Phong"};
        // mang bat dau index = 0
        int[] arr = {1,2,3,4,5};
        System.out.println("a[0] : " + arr[4]);
        for (int i = 0 ; i < arr.length  ; i++)
        {
            System.out.println(arr[i]);
        }

        int [][] matrix ={
                {1,2,3},
                {3,4,5}
        };
        System.out.println("length matrix:" + matrix.length);
        for (int i = 0; i<matrix.length ; i++ )
        {
            for (int j =0 ; j< matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }



//        Scanner sc = new Scanner(System.in);
//
//
//        System.out.println("nhap so luong mang ");
//        int n = sc.nextInt();
//        int[] arr = new int[n] ;
//
//        for (int i = 0 ; i < arr.length  ; i++)
//        {
//            System.out.println("nhap so thu " + i + " trong arr: ");
//            arr[i] = sc.nextInt();
//        }
//        for (int i = 0 ; i < arr.length  ; i++)
//        {
//            System.out.println("a[ "+i+"] : "+ arr[i]);
//        }



//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap n");
//        int n = sc.nextInt();
//        inRaSoN(n);
    }

    public static Integer tinhTong ( int a, int b  ){
       return a + b;
    }

    public static void inRaSoN (int n)
    {
        for ( int i = 0 ; i<n ; i ++)
        {
            System.out.println(i);
        }
    }

    // void , Integer , Double, Float,String


    // static : tĩnh biến tĩnh, hàm tĩnh
    //static:

    //




}