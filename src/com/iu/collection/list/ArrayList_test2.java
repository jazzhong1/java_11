package com.iu.collection.list;

import java.util.*;

public class ArrayList_test2 {
	
	public static void main(String[] args) {

		ArrayList ar=new ArrayList();
		ar.add("first");
		ar.add(2);
		ar.add(3.2);
		
		String str=(String)ar.get(0);
		int num=(Integer)ar.get(1);			//Integer 타입으로 자동박싱 되어서 접근할수있다.
		double du=(Double) ar.get(2);	//Double 타입으로 자동박싱되어서 접근할수있다.
		
		
		System.out.println(str);
		System.out.println(num);
		System.out.println(du);
		
		ArrayList<String>ar2=new ArrayList<>();
		//E= 타입을 넣으면된다, 클래스,정수,Reference타입만 담을수 있다.
		//앞에 정의하면 생성자부분에서는 생략가능
		//<>를 제네릭이라고 한다. 특정데이터타입을 보장하기위해 사용한다.
		ar2.add("first");
		String s= ar2.get(0);
		System.out.println(s);
		
	}
}
