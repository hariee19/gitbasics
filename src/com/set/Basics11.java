package com.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Basics11 {
public static void main(String[] args) {
 Set<Integer>a=new LinkedHashSet<Integer>();
 a.add(10);
 a.add(20);
 a.add(30);
 a.add(90);
 a.add(10);
 a.add(10);
 a.add(40);
 a.add(50);
 
 Set<Integer> a2=new LinkedHashSet<Integer>();
 a.add(10);
 a2.add(20);
 a2.add(60);
 a2.add(50);
 a2.add(40);
 a2.add(70);
 a2.add(80);
 
 a2.retainAll(a);
 System.out.println(a2);
 
}
}
