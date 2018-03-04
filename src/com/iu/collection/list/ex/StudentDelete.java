package com.iu.collection.list.ex;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDelete implements Action {
	
	private Student student;
	private StudentServiceView serviceView;
	private Scanner sc;
	
	public StudentDelete() {

		student=new Student();
		serviceView=new StudentServiceView();
		sc=new Scanner(System.in);
		
	}

	@Override
	public void excute() {
		// TODO Auto-generated method stub

	}

	@Override
	public void excute(Student student) {
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
				students.remove(i);
				serviceView.result("삭제완료");
				check=!check;
			}

		}
		
		if(!check){
			serviceView.result("학생정보를 확인하세요");	//처음부터 끝까지검사하기때문에 처음에 거짖이면 무조건 출력//
		}
	}

}
