package com.learnings;

import java.util.Scanner;
import java.util.*;

public class stack {
    private int []arr;
    private int capacity;
    int curr_size;

    stack(int sz){
        arr = new int[sz]; //sz is the size of stack
        capacity = sz;
        curr_size=0;
    }

    public boolean isEmpty(){
        if(curr_size==0){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(curr_size==capacity){
            return true;
        }
        return false;
    }

    public int GetTop(){
        if(curr_size==0){
            return -1;
        }
        return arr[curr_size-1];
    }
    public void insert(int x){
        if(curr_size==capacity){
            System.out.println("Stack is full");
        }
        arr[curr_size]=x;
        curr_size++;
    }

    public void removeTop(){
        if(curr_size==0){
            System.out.println("Stack is already empty");
            return;
        }
        curr_size--;
        return;
    }

    public static void main(String args[]){
        stack s = new stack(5);
        s.insert(1);
        System.out.println(s.GetTop());
        s.removeTop();
        s.removeTop();
        s.insert(10);
        System.out.println(s.GetTop());
        s.insert(12);
        System.out.println(s.GetTop());
        s.insert(121);
        s.insert(120);
        s.insert(31);
        System.out.println(s.GetTop());
        s.insert(10);




    }
}
