package com.learnings;
import java.util.*;
public class Employee {
    public String name;
    public String department;
    public int idx;
    public int ag;

    Employee(String dept,String nme, int id,int age){
        name = nme;
        department = dept;
        idx = id;
        ag = age;
    }




    public static void main(String []args){
        ArrayList<Employee> arr = new ArrayList<Employee>();
        Employee x1 = new Employee("Engineering","sarthak",636,22);
        Employee x2 = new Employee("sales","Agrim",954,23);
        Employee x3 = new Employee("sales","Dhruv",618,21);
        Employee x4 = new Employee("Engineering","Tripti",917,23);
        arr.add(x1);
        arr.add(x2);
        arr.add(x3);
        arr.add(x4);



        Collections.sort(arr,new sortbyid());
        System.out.println("After sorting wrt id");
        for(Employee x:arr){
            System.out.println(x.name+" "+x.department+" "+x.idx+" "+x.ag);
        }

        Collections.sort(arr,new sortbyname());
        System.out.println("After sorting wrt name");
        for(Employee x:arr){
            System.out.println(x.name+" "+x.department+" "+x.idx+" "+x.ag);
        }

        Collections.sort(arr,new sortbyage());
        System.out.println("After sorting wrt age");
        for(Employee x:arr){
            System.out.println(x.name+" "+x.department+" "+x.idx+" "+x.ag);
        }


    }

}
class sortbyage implements Comparator<Employee>{
     public int compare(Employee a, Employee b){
         return a.ag - b .ag;

     }

}
class sortbyname implements Comparator<Employee>{
    public int compare(Employee a, Employee b){
        return a.name.compareTo(b.name);

    }

}

class sortbyid implements Comparator<Employee>{
    public int compare(Employee a, Employee b){
        return a.idx - b .idx;

    }

}

