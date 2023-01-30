package com.set;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Basics4 {
	public static void main(String[] args) {
		
		List<Integer> a=new LinkedList<Integer>();
	a.add(10);
	a.add(20);
	a.add(30);
	a.add(90);
	a.add(10);
	a.add(10);
	a.add(40);
	a.add(50);
	
	Set<Integer>a1= new HashSet<Integer>();
	
	for (int i = 0; i <a.size(); i++) {
		System.out.println(a1.addAll(a));
	}
	System.out.println(a1);
	// soluitiom get by two methods
	
	for (int i = 0; i < a.size(); i++) {
		a1.add(a.get(i));
		
		
	}System.out.println(a1);
	}
}
