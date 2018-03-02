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
		
		ar.set(1, 3.2);
		System.out.println();
		
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		ar.add(1, 100);	//삽입이기때문에 해당인덱스에 삽입하고 뒤에 인덱스는 하나씩 밀린다.
		System.out.println();
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		ar.remove(1);	//삭제하고 해당인덱스를 앞으로 당긴다.
		System.out.println();
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		
	}
	
}
