package com.set;

import java.util.TreeSet;

public class Basics12 {
public static void main(String[] args) {
	TreeSet <Integer> m=new TreeSet<Integer>();
	m.add(10);
	m.add(20);
	m.add(30);
	m.add(90);
	m.add(10);
	m.add(10);
	m.add(40);
	m.add(50);
	
	TreeSet <Integer>m1  = new TreeSet<Integer>();
	m1.add(100);
	m1.add(200);
	m1.add(300);
	m1.add(400);
	m1.add(500);
	m1.add(600);
	m1.add(700);
	m1.add(800);
	
	m1.retainAll(m);
	System.out.println(m1);
	
	System.out.println(m);
	m1.removeAll(m);
	
	
}
}
