package com.hong.collection.list;

import java.util.ArrayList;

public class ArrayList_test2 {
	
	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		ar.add("first");
		ar.add(2);
		ar.add(3.2);

		String str = (String) ar.get(0);
		int num = (Integer) ar.get(1); // int 타입이 autoBoxing으로 인해 레퍼런스 Integer로 바뀜
		double du = (Double) ar.get(2); // double 타입이 autoBoxing으로 인해 레퍼런스 Double로 바뀜

		ArrayList<String> ar2 = new ArrayList<>(); // <>안에 변수가 담긴다. 변수 뒤에껀 생략가능, 레퍼런스만 담김
		ArrayList<Integer> ar3 = new ArrayList<>(); // <>를 제네릭이라 부른다. 이데이터가 이런 타입만 들어가있다는걸 보장할때 제네릭 사용
		ar2.add("first");
		String s = ar2.get(0);
	}
}
