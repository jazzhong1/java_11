package com.hong.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_test1 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		
		Iterator<Integer> it= ar.iterator();// ar에 들어있는 요소를 꺼내온다.열거형처럼
		while(it.hasNext()/* 다음에 가지고올 요소가 있는지 */){
			System.out.println(it.next());
		}
	}

}
