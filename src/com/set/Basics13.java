package com.set;

import java.util.HashSet;
import java.util.Set;

public class Basics13 {
public static void main(String[] args) {
	Set<Integer> a=new HashSet<Integer>();
	a.add(10);
	a.add(20);
	a.add(30);
	a.add(90);
	a.add(10);
	a.add(60);
	a.add(50);
	
	
	Set <Integer> a1=new HashSet<Integer>();
	a1.add(10);
	a1.add(20);
	a1.add(60);
	a1.add(50);
	a1.add(40);
	a1.add(70);
	a1.add(80);
	a1.add(90);
	
	a1.removeAll(a);
	System.out.println(a1);
}
}
