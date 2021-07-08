package com.learnings;

import java.util.HashSet;
import java.util.*;

public class Hashmap {
    public static void main(String []args){
        Integer []list1 = new Integer[]{2,4,1,56,3};
        Integer []list2 = new Integer[]{56,8,2,4,3};
        HashSet<Integer> st = new HashSet<Integer>();
        for(int i=0;i<5;i++){
            st.add(list1[i]);
        }
        for(int i=0;i<5;i++){
            if(st.contains(list2[i])){
                System.out.println(list2[i]);
            }
        }
    }



}
