package com.ibm.core.java.lab3.classwork1;

import java.util.ArrayList;
import java.util.List;


public class MethodInListNotInArrayList {
    public static void main(String[] args) {
        // List reference pointing to ArrayList object
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        // list.ensureCapacity(10);  // ERROR: method not found in List
        // ArrayList reference
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("X");
        arrayList.add("Y");
        // These methods exist only in ArrayList, not List
        arrayList.ensureCapacity(10);
        arrayList.trimToSize();
        System.out.println("List: " + list);
        System.out.println("ArrayList: " + arrayList);
    }
}