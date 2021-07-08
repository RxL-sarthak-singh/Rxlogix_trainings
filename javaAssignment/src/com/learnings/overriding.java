package com.learnings;

public class overriding {
    public static void main(String []args){
        ParentClass pr = new ParentClass();
        pr.display();
        ChildClass ch = new ChildClass();
        ch.display();
    }
}
class ParentClass{
    public static void display(){
        System.out.println("You are inside parent class");
    }

}
class ChildClass extends ParentClass{

    public static void display(){
        System.out.println("You are inside child class");
    }
}

