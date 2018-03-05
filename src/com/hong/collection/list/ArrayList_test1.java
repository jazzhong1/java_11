package com.hong.collection.list;

import java.util.ArrayList;

public class ArrayList_test1 {
	public static void main(String[] args) {

		// List 인터페이스 중 ArrayList 사용
		// ArrayList는 배열기반
		ArrayList ar = new ArrayList();
		// ArrayList에 추가하고 싶을때
		// ArrayList는 length대신 size를 가지고있다.
		ar.add("first");
		ar.add(2);
		ar.add('3');
		ar.add(true);

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		ar.set(1, 3.2);
		System.out.println("============");
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		ar.add(1, 100); // 인덱스번호 없이 사용하면 맨뒤에 입력됨, 인덱스번호를 쓰고 입력하면 그 인덱스위치에 들어가고 나머지애들이 뒤로 밀린다.
		System.out.println("============");
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		ar.remove(1);
		System.out.println("============"); // 해당인덱스에 값이 지워지고 나머지 애들이 당겨진다.
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
	}
		
}
