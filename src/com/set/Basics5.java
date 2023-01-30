package com.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Basics5 {
public static void main(String[] args) {
	List <Integer> a=new ArrayList<Integer>();
	a.add(105);
	a.add(205);
	a.add(205);
	a.add(405);
	a.add(505);
	a.add(605);
	a.add(805);
	a.add(905);
	
   int b=a.lastIndexOf(205);
   System.out.println(a.remove(b));
	System.out.println(a);
	
	
	Set <Integer>a1=new HashSet<Integer>();
	
	a1.addAll(a);
	System.out.println(a1);
	
	for (int i = 0; i <a.size(); i++) {
		a1.add(a.get(i));
		
	}System.out.println(a1);
}
}
