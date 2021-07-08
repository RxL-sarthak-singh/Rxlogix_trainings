package com.learnings;

import java.util.ArrayList;
import java.util.Queue;

public class queue {
    private ArrayList <Integer>  num = new ArrayList<Integer>();
    Integer curr_size = 0;


    public boolean isEmpty(){
        if(curr_size==0){
            return true;
        }
        return false;
    }

    public void add(Integer x){
        num.add(x);
        curr_size++;
    }
    public void getFirst(){
        if(curr_size==0){
            System.out.println("Queue is empty");

        }
        System.out.println(num.get(0));
    }
    public void remove(){
        if(num.size()==0){
            System.out.println("Queue is already empty");
            return;
        }
        num.remove(0);
        return;
    }

    public static void main(String []args){
        queue q = new queue();
        q.add(10);
        q.add(20);
        q.getFirst();
        q.remove();
        q.getFirst();
        q.remove();
        q.remove();
        q.remove();
    }

}
