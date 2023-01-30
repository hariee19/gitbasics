package com.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Basics6 {
	public static void main(String[] args) {
   List<Integer> a= new ArrayList <Integer>();
   a.add(100);
   a.add(200);
   a.add(300);
   a.add(400);
   a.add(500);
   a.add(600);
   a.add(700);
   a.add(800);
   a.add(900);
   a.add(100);
   a.add(200);
   a.add(300);
   
   Set<Integer> a1=new HashSet<Integer>();
   a1.addAll(a);
   System.out.println(a1);
		
   
   for (int i = 0; i <a.size(); i++) {
	a1.add(a.get(i));
	
}// System.out.println(a1);
		
	}

}
