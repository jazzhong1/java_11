package com.iu.collection.list;

import java.util.*;

public class ArrayList_test1 {
	public static void main(String[] args) {
		// List interface ->ArrayList
		// ArrayList=>배열기반
		
		ArrayList ar = new ArrayList();
		//ar.siz()		->배열에서 length와 같음
		ar.add("first");
		ar.add(2);
		ar.add('3');
		ar.add(true);
		
		//배열과다르게 
		
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
	}
}
