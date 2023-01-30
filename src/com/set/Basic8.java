package com.set;

import java.util.HashSet;
import java.util.Set;

public class Basic8 {
public static void main(String[] args) {
	Set<Integer> a=new HashSet<Integer>();
	a.add(10);
	a.add(200);
	a.add(30);
    a.add(400);
	a.add(500);
	a.add(600);
	a.add(700);
	
	
	Set<Integer> a1=new HashSet<Integer>();
for (Integer integer : a) {
	System.out.println(integer);
	
	
}System.out.println(a1);

}
}