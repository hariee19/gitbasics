package com.set;

import java.util.HashSet;
import java.util.Set;

public class Basics {
	public static void main(String[] args) {
		Set<Integer> a=new HashSet<Integer>();
		
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		a.add(70);
		a.add(80);
		a.add(90);
		a.add(10);
		a.add(20);
		System.out.println(a);
	}

}
