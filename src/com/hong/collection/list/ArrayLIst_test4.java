package com.hong.collection.list;

import java.util.ArrayList;

public class ArrayLIst_test4 {

	public static void main(String[] args) {

		Student student = new Student();
		student.setName("홍성진");
		student.setNum(1);

		ArrayList<Student> ar1 = new ArrayList<Student>();// 상황에 따라 뒤에도 넣어야 될때가 있다.
		ArrayList<Student> ar2 = new ArrayList<Student>();
		ar1.add(student);
		
		student=new Student();
		ar1.add(student);
		ar1.get(1).setName("cha");
		student.setName("suji");
		
		System.out.println(ar1.get(1).getName());
		
		ArrayList<ArrayList<Student>> ar3 = new ArrayList<ArrayList<Student>>();// ArrayList안에 ArrayList를 담는다.
		ar3.add(ar1);
		ar3.add(ar2);
		
		ar3.get(0).get(0).setName("감스트");
		System.out.println(ar3.get(0).get(0).getName());
		
		ArrayList<ArrayList<ArrayList<Student>>> ar4 = new ArrayList<ArrayList<ArrayList<Student>>>();// ArrayList안에 ArrayList 안에 ArrayList를 담는다.

		for (int i = 0; i < ar1.size(); i++) {
			System.out.println(ar1.get(i).getName());
		}
		
		for(Student student2:ar1){
			System.out.println(student2.getName());
			
		}
		
	}
}
