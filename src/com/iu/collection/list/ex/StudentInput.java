package com.iu.collection.list.ex;

import java.util.*;

public class StudentInput implements Action {
	private Scanner sc;
	private Student student;
	private StudentServiceView serviceView;

	public StudentInput() {
		StudentDataBase.students = new ArrayList<Student>();
		serviceView=new StudentServiceView();
		sc = new Scanner(System.in);
	}

	@Override
	public void excute() {
		System.out.println("학생등록");
		student = new Student();		///student를 하나씩만들어서 넣어야한다.
										///배열을 만들었다고 배열안에 학생이 들어가있는것은 아니다.

		System.out.print("이름입력:");
		student.setName(sc.next());
		System.out.print("번호:");
		student.setNum(sc.nextInt());

		StudentDataBase.students.add(student);

		for (int i = 0; i < StudentDataBase.students.size(); i++) {

			for (int j = 0; j < i; j++) {
				if (StudentDataBase.students.get(j).getNum() == (StudentDataBase.students.get(i).getNum())) {
					serviceView.result("학생정보를 확인하세요");
					
					System.out.print("번호:");
					student.setNum(sc.nextInt());
					StudentDataBase.students.set(i, student);
					continue;
				}
			}

		}

	}

	@Override
	public void excute(ArrayList<Student> students) {

	}

	@Override
	public void excute(Student student) {
		// TODO Auto-generated method stub
		
	}
}
