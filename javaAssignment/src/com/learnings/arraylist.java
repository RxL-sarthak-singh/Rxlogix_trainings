package com.learnings;
import java.util.*;

public class arraylist {
    private int []arr = new int[10];
    int curr_cap = 10;
    int curr_sz = 0;

    public void add(int x){
        arr[curr_sz] = x;
        curr_sz ++;
        if(curr_sz > curr_cap/2){
            int newsz = curr_cap*2;
            arr = Arrays.copyOf(arr,newsz);

        }

    }

    public int get(int idx){
        if(idx<0 || idx>curr_sz){
            throw new IndexOutOfBoundsException();

        }
        return arr[idx];
    }
    public void remove(int idx){
        if(idx<0 || idx>curr_sz){
            throw new IndexOutOfBoundsException();

        }
        for(int i=idx;i<curr_sz;i++){
            arr[i] = arr[i+1];
        }
        curr_sz--;
        if(curr_sz*2 < curr_cap  && curr_cap>10){
            arr = Arrays.copyOf(arr,curr_cap/2);
            curr_cap = curr_cap/2;
        }

    }

    public void print(){
        for(int i = 0;i<curr_sz;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String []args){
        arraylist arr = new arraylist();
        arr.add(10);
        arr.add(20);
        arr.print();
        arr.add(30);
        arr.add(40);
        arr.print();
        arr.remove(1);
        arr.remove(3);
        arr.print();


    }
}
