package com.learnings;
import java.util.*;

public class LRU {
    private Deque<Integer> doublendedqueue;
    private HashSet<Integer> table;
    private int capacity;

    LRU(int size){
        capacity  = size;
        doublendedqueue  = new LinkedList<>();
        table = new HashSet<>();


    }
    public void put(Integer a){
        if(!table.contains(a)){
            if(doublendedqueue.size()==capacity) {
                Integer x = doublendedqueue.removeLast();
                table.remove(x);
            }
        }
        else{
            doublendedqueue.remove(a);
        }
        doublendedqueue.push(a);
        table.add(a);

    }
    public void displayCache(){
        Iterator<Integer> it = doublendedqueue.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
    }
    public static void main(String []args){
        LRU l = new LRU(3);
        l.put(1);
        l.displayCache();
        l.put(2);
        l.displayCache();
        l.put(3);
        l.displayCache();
        l.put(2);
        l.displayCache();
        l.put(4);
        l.displayCache();
        l.put(1);
        l.displayCache();


    }

}
