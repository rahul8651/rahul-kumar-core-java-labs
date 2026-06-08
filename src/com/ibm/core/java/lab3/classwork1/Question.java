package com.ibm.core.java.lab3.classwork1;

import java.util.ArrayList;
import java.util.List;

public class Question {
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Rahul");
		list.add("Vishal");
		list.add("Rajeev");
		list.add("Raja");
		
		for(String str:list) {
			System.out.print(str+" ");
		}
		System.err.println();
		list.remove(3);
		for(String str:list) {
			System.out.print(str+" ");
		}
		
		
		
	}

}
