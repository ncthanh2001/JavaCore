package org.javacore;

public class StudentJava extends Students  {


    //overloading


    public void helloStudentsJava()
    {
        System.out.println("hello studentJava: "+ super.mssv);

    }

    public void helloStudentsJava(String name)
    {
        System.out.println("hello studentJava: "+ super.mssv);
        System.out.println("Name"+name);
    }

    @Override // ghi de phuong thuc
    public void hello() {
        System.out.println("hello students java");
    }
}
