package com.iu.collection.list.ex;

import java.util.ArrayList;

public class StudentServiceView implements Action {

	@Override
	public void excute() {
		
	}
	
	@Override
	public void excute(Student student) {
		
		System.out.println("이름: "+student.getName());
		System.out.println("번호: "+student.getNum());
		System.out.println("국어점수: "+student.getKor());
		System.out.println("영어점수: "+student.getEng());
		System.out.println("수학점수: "+student.getMath());
	}
	

	@Override
	public void excute(ArrayList<Student> students) {
		for (Student student:students){
			this.excute(student);
		}
	}
	
	
	public void result(String str){
		System.out.println(str);
		
	}



}

