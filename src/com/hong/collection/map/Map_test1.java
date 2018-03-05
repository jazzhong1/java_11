package com.hong.collection.map;

import java.util.HashMap;
import java.util.Iterator;

public class Map_test1 {
	public static void main(String[] args) {
		
		HashMap<String, String>hashMap=new HashMap<String, String>();
		
		hashMap.put("f1", "홍성진");
		hashMap.put("f2", "감스트");
		
		System.out.println(hashMap.get("f2"));
		
		hashMap.put("f2", "suji");
		hashMap.put("f3", "suji");
		
		System.out.println(hashMap.size());

		Iterator<String>it=hashMap.keySet().iterator();
		//키들을 모아서 새로운 Set컬렉션으로 바꿔 버린다.
		// 이것을 다시 iterator로 바꿔버린다.
		//hashmap에서 값을 꺼내려면 key값을 알아야한다.
		//map에서 반복을 이용해 꺼낼때방법
		//web에서 많이 사용
		
		
			
		
		while(it.hasNext()){
			String key=it.next();
			System.out.println(hashMap.get(key));
		}
	}
}
