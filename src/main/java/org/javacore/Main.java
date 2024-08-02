package org.javacore;

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

       Students s = new Students();
       s.hello();

       Students.hellos();
    }

    public int tinhtong ( int a , int b ){
        return a + b;
    }

}