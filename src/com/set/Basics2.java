package com.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Basics2 {
	public static void main(String[] args) {
		
	LinkedHashSet<Integer>a=new LinkedHashSet<Integer>();
	a.add(10);
	a.add(20);
	a.add(30);
	a.add(40);
	a.add(50);
	a.add(50);
	a.add(10);
	a.add(20);
	// because set will nopt allow duplicate values
	
	
	System.out.println(a);
	}
}
