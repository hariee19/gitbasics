package com.set;

import java.util.HashSet;
import java.util.Set;

public class Basics7 {
	public static void main(String[] args) {
		
	
	Set<Integer> a=new HashSet<Integer>();
	a.add(100);
	a.add(200);
	a.add(300);	Set<Integer> a1=new HashSet<Integer>();

	a.add(400);
	a.add(500);
	a.add(600);
	a.add(700);
	
	for (Integer x : a) {
		System.out.println(x);
	}
	}
}
