package org.javacore;

public class Dog extends Animal implements ActionAnimal{

    String name;
    public Dog()
    {

    }
    public Dog(String name)
    {
        this.name = name;
    }

    @Override
    void makeSoud() {
        System.out.println("Gaau Gauu");
    }

    void printName()
    {
        System.out.println(name);
    }

    @Override
    public void move() {
        System.out.println("Di chuyen bang 4 chan");
    }

    @Override
    public String eat(String type) {
        return type;
    }


}
