package com.hong.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_test3 {
	
	public static void main(String[] args) {
		
		ArrayList<String>ar=new ArrayList();
		
		ar.add("A");
		ar.add("B");
		System.out.println(ar.size());
		
		ar.remove(1);
		System.out.println(ar.size());
		
		ar.add("C");
		ar.add("D");
		System.out.println(ar.size());
		
		List<String> ar2=ar.subList(1, 2);
		System.out.println(ar2.size());
		
		ar.clear();
		System.out.println(ar.size());
		
	}

}
