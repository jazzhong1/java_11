package com.iu.collection.list.ex;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentScoreInput implements Action {
	
	private Student student;
	private StudentServiceView serviceView;
	private Scanner sc;
	
	public StudentScoreInput() {
		student = new Student();
		serviceView=new StudentServiceView();
		sc=new Scanner(System.in);
	}

	@Override
	public void excute() {
		// TODO Auto-generated method stub

	}

	@Override
	public void excute(ArrayList<Student> students) {


		System.out.print("이름입력:");
		student.setName(sc.next());
		System.out.print("번호:");
		student.setNum(sc.nextInt());

		boolean check=false;
		
		for (int i = 0; i < students.size(); i++) {
			if (student.getName().equals(students.get(i).getName()) && student.getNum() == students.get(i).getNum()) {
				//String equals로 비교한다.
				
				System.out.print("국어점수:");
				students.get(i).setKor(sc.nextInt());
				System.out.print("영어점수:");
				students.get(i).setEng(sc.nextInt());
				System.out.print("수학점수:");
				students.get(i).setMath(sc.nextInt());
				
				students.get(i).setTotal(students.get(i).getKor()+students.get(i).getEng()+students.get(i).getMath());
				students.get(i).setAvg((double)students.get(i).getTotal()/3);
				check=!check;
			}

		}
		
		if(!check){
			serviceView.result("학생정보를 확인하세요");	//처음부터 끝까지검사하기때문에 처음에 거짖이면 무조건 출력//
		}

	}

	@Override
	public void excute(Student student) {
		// TODO Auto-generated method stub
		
	}
}
